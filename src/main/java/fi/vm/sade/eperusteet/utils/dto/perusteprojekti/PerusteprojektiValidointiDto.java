package fi.vm.sade.eperusteet.utils.dto.perusteprojekti;

import fi.vm.sade.eperusteet.utils.dto.peruste.PerusteValidointiDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerusteprojektiValidointiDto {
    private Long id;
    private PerusteValidointiDto peruste;
}
