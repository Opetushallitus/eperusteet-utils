package fi.vm.sade.eperusteet.utils.dto.validointi;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class RakenneValidointiDto {
    public List<RakenneOngelmaDto> ongelmat = new ArrayList<>();
}
