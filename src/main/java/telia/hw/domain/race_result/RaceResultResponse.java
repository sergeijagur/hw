package telia.hw.domain.race_result;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RaceResultResponse {
    private String raceName;
    private String racePlace;
    private LocalDate raceDate;
    private String winner;
    private String secondPlace;
    private String thirdPlace;
}
