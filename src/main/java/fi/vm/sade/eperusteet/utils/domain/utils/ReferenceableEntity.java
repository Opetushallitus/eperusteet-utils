package fi.vm.sade.eperusteet.utils.domain.utils;

import fi.vm.sade.eperusteet.utils.dto.utils.Reference;

import java.io.Serializable;
import java.util.function.Predicate;

public interface ReferenceableEntity {

    /**
     * Määrittää mitä entiteetin arvoa käytetään referenssinä.
     *
     * @return reference
     */
    Reference getReference();

    /**
     * Palauttaa viitattavissa olevan entityn yksikäsitteisen avaimen.
     * Avain pitää olla mahdollista muuttaa merkkijonoksi (järkevä toString-methodi vaaditaan).
     *
     * @return id
     */
    Serializable getId();

    static <T extends ReferenceableEntity> Predicate<T> idEquals(Serializable id) {
        return e -> id != null && id.equals(e.getId());
    }
}