package telia.hw.domain.race;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class RaceInfoRequest implements Serializable {
    private final String name;
    private final String place;
    private final LocalDate date;
}
