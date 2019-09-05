package fi.vm.sade.eperusteet.utils.dto.peruste.utils;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class PerusteTekstiKappaleViiteDto extends PerusteTekstiKappaleViiteMatalaDto {
    private List<PerusteTekstiKappaleViiteDto> lapset = new ArrayList<>();
}
