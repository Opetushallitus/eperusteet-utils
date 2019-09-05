package fi.vm.sade.eperusteet.utils.dto.peruste.lops2019.oppiaineet;

import fi.vm.sade.eperusteet.utils.dto.utils.LokalisoituTekstiDto;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Lops2019ArviointiDto {
    private LokalisoituTekstiDto kuvaus;
}
