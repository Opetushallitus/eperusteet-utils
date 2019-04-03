package fi.vm.sade.eperusteet.utils.dto.lops2019;

import fi.vm.sade.eperusteet.utils.dto.util.LokalisoituTekstiDto;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = { "koodiUri" })
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lops2019OpintojaksonModuuliDto {
    private String koodiUri;
    private LokalisoituTekstiDto kuvaus;
}
