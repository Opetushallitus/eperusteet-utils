package fi.vm.sade.eperusteet.utils.dto.validointi;

import fi.vm.sade.eperusteet.utils.dto.util.LokalisoituTekstiDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RakenneOngelmaDto {
    public String ongelma;
    public LokalisoituTekstiDto ryhma;
}
