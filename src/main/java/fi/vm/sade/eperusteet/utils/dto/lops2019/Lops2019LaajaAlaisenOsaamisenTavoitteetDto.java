package fi.vm.sade.eperusteet.utils.dto.lops2019;

import fi.vm.sade.eperusteet.utils.dto.util.LokalisoituTekstiDto;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Lops2019LaajaAlaisenOsaamisenTavoitteetDto {
    private LokalisoituTekstiDto etuliite;
    private List<Lops2019LaajaAlaisenOsaamisenTavoiteDto> tavoitteet = new ArrayList<>();
}
