package fi.vm.sade.eperusteet.utils.dto.peruste.lops2019.oppiaineet;

import fi.vm.sade.eperusteet.utils.dto.peruste.lops2019.tutkinnonrakenne.KoodiDto;
import fi.vm.sade.eperusteet.utils.dto.utils.LokalisoituTekstiDto;
import fi.vm.sade.eperusteet.utils.dto.utils.Reference;
import fi.vm.sade.eperusteet.utils.dto.utils.ReferenceableDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Lops2019OppiaineBaseDto implements ReferenceableDto {
    private Long id;
    private LokalisoituTekstiDto nimi;
    private KoodiDto koodi;
    private Reference oppiaine;
    private Lops2019ArviointiDto arviointi;
    private Lops2019TehtavaDto tehtava;
    private Lops2019OppiaineLaajaAlainenOsaaminenDto laajaAlaisetOsaamiset;
    private Lops2019OppiaineTavoitteetDto tavoitteet;
}
