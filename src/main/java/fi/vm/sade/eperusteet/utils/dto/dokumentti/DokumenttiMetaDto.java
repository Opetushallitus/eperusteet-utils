package fi.vm.sade.eperusteet.utils.dto.dokumentti;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DokumenttiMetaDto {
    private String title;
    private String author;
    private String subject;
    private String keywords;
    private String creator;
    private String producer;
}
