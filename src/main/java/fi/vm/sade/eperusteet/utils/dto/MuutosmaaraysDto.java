package fi.vm.sade.eperusteet.utils.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import fi.vm.sade.eperusteet.utils.dto.util.LokalisoituTekstiDto;
import lombok.Getter;
import lombok.Setter;

/**
 * @author isaul
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class MuutosmaaraysDto {
    private Long id;
    private LokalisoituTekstiDto nimi;
    private LokalisoituTekstiDto url;
}
