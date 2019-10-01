package fi.vm.sade.eperusteet.utils.client;

import org.springframework.core.NestedRuntimeException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class OphClientException extends NestedRuntimeException {

    public OphClientException(String message) {
        super(message);
    }

    public OphClientException(String message, Throwable cause) {
        super(message, cause);
    }

}
