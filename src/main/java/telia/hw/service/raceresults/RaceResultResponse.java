package telia.hw.service.raceresults;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class RaceResultResponse implements Serializable {

    private String raceName;
    private String racePlace;
    private LocalDate raceDate;
    private Integer winnerHorseId;
    private Integer secondPlaceHorseId;
    private Integer thirdPlaceHorseId;
    private Boolean win = false;
}
