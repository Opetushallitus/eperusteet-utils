package fi.vm.sade.eperusteet.utils.dto.peruste.utils;

import fi.vm.sade.eperusteet.utils.domain.utils.Tila;
import fi.vm.sade.eperusteet.utils.dto.utils.LokalisoituTekstiDto;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author jhyoty
 */
@Getter
@Setter
public class PerusteTekstiKappaleDto {
    private Long id;
    private Date luotu;
    private Date muokattu;
    private LokalisoituTekstiDto nimi;
    private LokalisoituTekstiDto teksti;
    private Tila tila;
    private String tunniste;
    private String osanTyyppi;
}
