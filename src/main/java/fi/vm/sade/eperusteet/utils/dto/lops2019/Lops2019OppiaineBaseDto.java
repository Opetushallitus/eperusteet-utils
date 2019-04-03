package fi.vm.sade.eperusteet.utils.dto.lops2019;

import fi.vm.sade.eperusteet.utils.dto.KoodiDto;
import fi.vm.sade.eperusteet.utils.dto.util.LokalisoituTekstiDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lops2019OppiaineBaseDto {
    private Long id;
    private KoodiDto koodi;
    private LokalisoituTekstiDto nimi;
    private LokalisoituTekstiDto kuvaus;
    private Lops2019OppiaineenArviointi arviointi;
    private Lops2019OppiaineenTehtava tehtava;
    private Lops2019OppimaaranLaajaAlaisetOsaamisetDto laajaAlainenOsaaminen;
//    private Lops2019OppiaineenTavoitteet tavoitteet;
}
