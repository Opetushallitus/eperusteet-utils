package fi.vm.sade.eperusteet.utils.dto.peruste;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TutkinnonOsaQueryDto {
    @Builder.Default
    private int sivu = 0;
    @Builder.Default
    private int sivukoko = 25;
    private String nimi;
    private String koodiUri;
    @Builder.Default
    private boolean kaikki = false;
}
