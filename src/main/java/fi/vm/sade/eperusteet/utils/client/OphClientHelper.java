package fi.vm.sade.eperusteet.utils.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fi.vm.sade.javautils.http.OphHttpClient;
import fi.vm.sade.javautils.http.OphHttpEntity;
import fi.vm.sade.javautils.http.OphHttpRequest;
import java.io.IOException;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static javax.servlet.http.HttpServletResponse.SC_BAD_REQUEST;
import static javax.servlet.http.HttpServletResponse.SC_CREATED;
import static javax.servlet.http.HttpServletResponse.SC_FORBIDDEN;
import static javax.servlet.http.HttpServletResponse.SC_INTERNAL_SERVER_ERROR;
import static javax.servlet.http.HttpServletResponse.SC_METHOD_NOT_ALLOWED;
import static javax.servlet.http.HttpServletResponse.SC_OK;
import static javax.servlet.http.HttpServletResponse.SC_UNAUTHORIZED;

@Slf4j
@Service
public class OphClientHelper {

    @Autowired
    RestClientFactory restClientFactory;

    private final ObjectMapper objectMapper = new ObjectMapper();

    public <T> T get(String serviceUrl, String url, Class<T> clazz) {
        return execute(serviceUrl, url, null, clazz, HttpGet.METHOD_NAME);
    }

    public void post(String serviceUrl, String url) {
        post(serviceUrl, url, Object.class);
    }

    public <T> T post(String serviceUrl, String url, Class<T> clazz) {
        return execute(serviceUrl, url, null, clazz, HttpPost.METHOD_NAME);
    }

    public <T> T execute(String serviceUrl, String url, Object content, Class<T> clazz, String httpMethod) {
        OphHttpClient client = restClientFactory.get(serviceUrl, true);

        try {
            OphHttpRequest.Builder builder = new OphHttpRequest.Builder(httpMethod, url);
            if(content != null) {
                builder = builder.addHeader("Content-Type", "application/json;charset=UTF-8")
                            .setEntity(new OphHttpEntity.Builder()
                            .content(objectMapper.writeValueAsString(content))
                            .contentType(ContentType.APPLICATION_JSON)
                            .build());
            }

            OphHttpRequest request = builder.build();

            return client.<T>execute(request)
                    .handleErrorStatus(SC_UNAUTHORIZED, SC_FORBIDDEN, SC_METHOD_NOT_ALLOWED, SC_BAD_REQUEST, SC_INTERNAL_SERVER_ERROR)
                    .with(res -> {
                        return Optional.empty();
                    })
                    .expectedStatus(SC_OK, SC_CREATED)
                    .mapWith(text -> {
                        try {
                            if(StringUtils.isEmpty(text)) {
                                return null;
                            }
                            return objectMapper.readValue(text, clazz);
                        } catch (IOException e) {
                            log.error(e.getMessage());
                            throw new OphClientException("parsinta-epaonnistui");
                        }
                    })
                    .orElse(null);
        } catch (JsonProcessingException e) {
            throw new OphClientException("kutsu-epaonnistui", e);
        }
    }

}
