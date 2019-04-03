package fi.vm.sade.eperusteet.utils.dto.perusteprojekti;

import fi.vm.sade.eperusteet.utils.dto.peruste.PerusteKoulutuskoodiDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerusteprojektiKoulutuskoodiDto {
    private Long id;
    private PerusteKoulutuskoodiDto peruste;
}
