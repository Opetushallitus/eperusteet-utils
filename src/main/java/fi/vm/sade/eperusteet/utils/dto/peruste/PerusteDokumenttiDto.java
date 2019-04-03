package fi.vm.sade.eperusteet.utils.dto.peruste;

import fi.vm.sade.eperusteet.utils.domain.Kieli;
import fi.vm.sade.eperusteet.utils.domain.PerusteTyyppi;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class PerusteDokumenttiDto {
    private Long id;
    private PerusteTyyppi tyyppi;
    private Set<Kieli> kielet;
    private Set<SuoritustapaDto> suoritustavat;
    private PerusteVersionDto globalVersion;
}
