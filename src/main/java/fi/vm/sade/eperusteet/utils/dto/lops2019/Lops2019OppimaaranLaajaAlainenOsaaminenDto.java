package fi.vm.sade.eperusteet.utils.dto.lops2019;

import fi.vm.sade.eperusteet.utils.dto.Reference;
import fi.vm.sade.eperusteet.utils.dto.util.LokalisoituTekstiDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lops2019OppimaaranLaajaAlainenOsaaminenDto {
    private Reference laajaAlainenOsaaminen;
    private LokalisoituTekstiDto kuvaus;
}
