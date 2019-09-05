package fi.vm.sade.eperusteet.utils.dto.peruste.lops2019.oppiaineet.moduuli;

import fi.vm.sade.eperusteet.utils.dto.peruste.lops2019.tutkinnonrakenne.KoodiDto;
import fi.vm.sade.eperusteet.utils.dto.utils.LokalisoituTekstiDto;
import fi.vm.sade.eperusteet.utils.dto.utils.ReferenceableDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Lops2019ModuuliBaseDto implements ReferenceableDto {
    private Long id;
    private LokalisoituTekstiDto nimi;
    private boolean pakollinen;
    private KoodiDto koodi;
}
