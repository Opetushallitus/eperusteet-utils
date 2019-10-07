package fi.vm.sade.eperusteet.utils.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

@Configuration
public class RestTemplateConfig {

    @Autowired
    RestClientFactory restClientFactory;

    @Bean
    @Scope("prototype")
    HttpHeaders httpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Caller-Id", restClientFactory.getCallerId());
        headers.add("CSRF", "CachingRestClient");

        return headers;
    }

    @Bean
    @Scope("prototype")
    HttpEntity httpEntity() {
        return new HttpEntity(httpHeaders());
    }
}
