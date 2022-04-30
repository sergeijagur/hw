package telia.hw.service.race;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

@Data
public class RaceInfoRequest implements Serializable {
    private final Integer userId;
    private final String name;
    private final String place;
    private final LocalDate date;

}
