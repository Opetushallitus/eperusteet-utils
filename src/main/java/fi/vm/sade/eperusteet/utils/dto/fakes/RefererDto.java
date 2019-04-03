package fi.vm.sade.eperusteet.utils.dto.fakes;

import fi.vm.sade.eperusteet.utils.dto.Reference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RefererDto {
    private Reference ref;
    private Optional<Reference> javaOptional;
}