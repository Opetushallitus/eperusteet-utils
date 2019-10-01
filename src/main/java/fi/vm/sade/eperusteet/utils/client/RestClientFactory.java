package fi.vm.sade.eperusteet.utils.client;

import fi.vm.sade.javautils.http.OphHttpClient;

public interface RestClientFactory {

    OphHttpClient get(String service, boolean requireCas);
}
