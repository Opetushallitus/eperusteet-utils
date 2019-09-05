package fi.vm.sade.eperusteet.utils.domain.utils;

import java.util.EnumSet;
import java.util.Set;

public enum Tila {
    LUONNOS("luonnos") {
        @Override
        public Set<Tila> mahdollisetSiirtymat(boolean isPohja) {
            return EnumSet.of(VALMIS, POISTETTU);
        }
    },
    VALMIS("valmis") {
        @Override
        public Set<Tila> mahdollisetSiirtymat(boolean isPohja) {
            return isPohja ? EnumSet.of(LUONNOS, POISTETTU) : EnumSet.of(LUONNOS, POISTETTU, JULKAISTU);
        }
    },
    POISTETTU("poistettu") {
        @Override
        public Set<Tila> mahdollisetSiirtymat(boolean isPohja) {
            return EnumSet.of(LUONNOS, POISTETTU);
        }
    },
    JULKAISTU("julkaistu") {
        @Override
        public Set<Tila> mahdollisetSiirtymat(boolean isPohja) {
            return EnumSet.of(LUONNOS);
        }
    };

    private final String tila;

    Tila(String tila) {
        this.tila = tila;
    }

    public Set<Tila> mahdollisetSiirtymat() {
        return mahdollisetSiirtymat(false);
    }

    public Set<Tila> mahdollisetSiirtymat(boolean isPohja) {
        return EnumSet.noneOf(Tila.class);
    }

    @Override
    public String toString() {
        return tila;
    }

}
