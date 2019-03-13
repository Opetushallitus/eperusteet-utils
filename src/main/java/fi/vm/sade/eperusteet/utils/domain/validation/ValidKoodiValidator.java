package fi.vm.sade.eperusteet.utils.domain.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;


public class ValidKoodiValidator implements ConstraintValidator<ValidKoodisto, IKoodi> {
    private String koodisto = "";

    @Override
    public void initialize(ValidKoodisto constraintAnnotation) {
        koodisto = constraintAnnotation.koodisto();
    }

    @Override
    public boolean isValid(IKoodi koodi, ConstraintValidatorContext context) {
        if (koodi != null && koodisto != null && !koodisto.isEmpty())) {
            return Objects.equals(koodisto, koodi.getKoodisto());
        }
        else {
            return true;
        }
    }
}
