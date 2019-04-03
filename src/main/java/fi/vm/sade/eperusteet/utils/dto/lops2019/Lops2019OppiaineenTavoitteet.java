package fi.vm.sade.eperusteet.utils.dto.lops2019;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import fi.vm.sade.eperusteet.utils.dto.util.LokalisoituTekstiDto;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Lops2019OppiaineenTavoitteet {
    private LokalisoituTekstiDto kuvaus;
    private List<Lops2019OppiaineenTavoitealue> tavoitealueet = new ArrayList<>();
}
