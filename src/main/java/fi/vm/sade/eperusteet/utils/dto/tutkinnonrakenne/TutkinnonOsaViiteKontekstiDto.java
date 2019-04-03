package fi.vm.sade.eperusteet.utils.dto.tutkinnonrakenne;

import com.fasterxml.jackson.annotation.JsonInclude;
import fi.vm.sade.eperusteet.utils.dto.peruste.PerusteInfoDto;
import fi.vm.sade.eperusteet.utils.dto.peruste.SuoritustapaDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TutkinnonOsaViiteKontekstiDto extends TutkinnonOsaViiteDto {
    PerusteInfoDto peruste;
    SuoritustapaDto suoritustapa;
}
