package fi.vm.sade.eperusteet.utils.dto.perusteprojekti;

import fi.vm.sade.eperusteet.utils.domain.ProjektiTila;
import fi.vm.sade.eperusteet.utils.dto.peruste.PerusteDokumenttiDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerusteprojektiDokumenttiDto {
    private PerusteDokumenttiDto peruste;
    private ProjektiTila tila;
}
