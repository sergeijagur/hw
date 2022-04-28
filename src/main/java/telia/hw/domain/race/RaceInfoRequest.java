package telia.hw.domain.race;

import lombok.Data;

import telia.hw.domain.horse.RaceHorse;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
public class RaceInfoRequest implements Serializable {
    private final String name;
    private final String place;
    private final LocalDate date;
    @Size (max = 6)
    private List<RaceHorse> horses;
}
