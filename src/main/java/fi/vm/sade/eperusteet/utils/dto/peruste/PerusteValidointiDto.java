package fi.vm.sade.eperusteet.utils.dto.peruste;

import fi.vm.sade.eperusteet.utils.domain.PerusteTyyppi;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerusteValidointiDto {
    private Long id;
    private PerusteTyyppi tyyppi;
}
