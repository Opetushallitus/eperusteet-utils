package fi.vm.sade.eperusteet.utils.dto.peruste.lops2019.oppiaineet;

import fi.vm.sade.eperusteet.utils.dto.utils.LokalisoituTekstiDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Lops2019OppiaineTavoitealueDto {
    private LokalisoituTekstiDto nimi;
    private LokalisoituTekstiDto kohde;
    private List<LokalisoituTekstiDto> tavoitteet = new ArrayList<>();
}
