package fi.vm.sade.eperusteet.utils.dto.peruste.lops2019.tutkinnonrakenne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.Map;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = { "koodisto", "uri", "versio" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class KoodiDto {
    private Map<String, String> nimi;
    private String arvo;
    private String uri;
    private String koodisto;
    private Long versio;

    static public KoodiDto of(String koodisto, String arvo) {
        KoodiDto result = new KoodiDto();
        result.setUri(koodisto + "_" + arvo);
        result.setKoodisto(koodisto);
        result.setArvo(arvo);
        return result;
    }
}
