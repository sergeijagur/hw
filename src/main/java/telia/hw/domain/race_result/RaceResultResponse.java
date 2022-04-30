package telia.hw.domain.race_result;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class RaceResultResponse implements Serializable {


    private final String raceName;
    private final String racePlace;
    private final LocalDate raceDate;
    private final Integer winnerHorseId;
    private final Integer secondPlaceHorseId;
    private final Integer thirdPlaceHorseId;
}
