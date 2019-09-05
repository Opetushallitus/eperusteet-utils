package fi.vm.sade.eperusteet.utils.dto.utils;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import fi.vm.sade.eperusteet.utils.domain.utils.Kieli;
import lombok.Getter;

import java.util.*;

public class LokalisoituTekstiDto {

    private static final Map<Kieli, String> emptyMap = new EnumMap<>(Kieli.class);

    @Getter
    private final Long id;

    @Getter
    private UUID tunniste;

    @Getter
    private final Map<Kieli, String> tekstit;

    public LokalisoituTekstiDto(Long id, Map<Kieli, String> values) {
        this(id, null, values);
    }

    public LokalisoituTekstiDto(Long id, UUID tunniste, Map<Kieli, String> values) {
        this.id = id;
        this.tunniste = tunniste;
        this.tekstit = values == null ? null : new EnumMap<>(values);
    }

    static public LokalisoituTekstiDto of(String teksti) {
        return of(Kieli.FI, teksti);
    }

    static public LokalisoituTekstiDto of(Kieli kieli, String teksti) {
        Map<Kieli, String> kaannokset = new HashMap<>();
        kaannokset.put(kieli, teksti);
        return new LokalisoituTekstiDto(null, kaannokset);
    }

    public boolean containsKey(Kieli kieli) {
        return tekstit.containsKey(kieli);
    }

    @JsonCreator
    public LokalisoituTekstiDto(Map<String, String> values) {
        Long tmpId = null;
        EnumMap<Kieli, String> tmpValues = new EnumMap<>(Kieli.class);

        if (values != null) {
            for (Map.Entry<String, String> entry : values.entrySet()) {
                if ("_id".equals(entry.getKey())) {
                    tmpId = Long.valueOf(entry.getValue());
                }
                else if ("_tunniste".equals(entry.getKey())) {
                    this.tunniste = UUID.fromString(entry.getValue());
                }
                else {
                    Kieli k = Kieli.of(entry.getKey());
                    tmpValues.put(k, entry.getValue());
                }
            }
        }

        this.id = tmpId;
        this.tekstit = tmpValues;
    }

    @JsonValue
    public Map<String, String> asMap() {
        HashMap<String, String> map = new HashMap<>();
        if (id != null) {
            map.put("_id", id.toString());
        }
        if (tunniste != null) {
            map.put("_tunniste", tunniste.toString());
        }
        for (Map.Entry<Kieli, String> e : tekstit.entrySet()) {
            map.put(e.getKey().toString(), e.getValue());
        }
        return map;
    }

    @JsonIgnore
    public String get(Kieli kieli) {
        return tekstit.get(kieli);
    }

}
