package fi.vm.sade.eperusteet.utils.dto.peruste.lops2019.oppiaineet.moduuli;

import fi.vm.sade.eperusteet.utils.dto.utils.LokalisoituTekstiDto;
import fi.vm.sade.eperusteet.utils.dto.utils.Reference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Lops2019ModuuliDto extends Lops2019ModuuliBaseDto {
    private LokalisoituTekstiDto kuvaus;
    private BigDecimal laajuus;
    private Lops2019ModuuliTavoiteDto tavoitteet;
    private List<Lops2019ModuuliSisaltoDto> sisallot = new ArrayList<>();
    private Reference oppiaine;
}
