package fi.vm.sade.eperusteet.utils.dto.peruste.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerusteTekstiKappaleViiteMatalaDto {
    private Long id;
    private PerusteTekstiKappaleDto perusteenOsa;
    private Long perusteTekstikappaleId;
}
