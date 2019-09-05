package fi.vm.sade.eperusteet.utils.dto.peruste.lops2019;

import fi.vm.sade.eperusteet.utils.dto.peruste.lops2019.laajaalainenosaaminen.Lops2019LaajaAlainenOsaaminenKokonaisuusDto;
import fi.vm.sade.eperusteet.utils.dto.peruste.lops2019.oppiaineet.Lops2019OppiaineKaikkiDto;
import fi.vm.sade.eperusteet.utils.dto.peruste.utils.PerusteTekstiKappaleViiteDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Lops2019SisaltoDto {
    private Lops2019LaajaAlainenOsaaminenKokonaisuusDto laajaAlainenOsaaminen;
    private List<Lops2019OppiaineKaikkiDto> oppiaineet = new ArrayList<>();;
    private PerusteTekstiKappaleViiteDto sisalto;
}

