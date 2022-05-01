package telia.hw.service.raceresults;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class ResultResponse implements Serializable {
    private  Integer id;
    private  Integer raceId;
    private  String raceName;
    private  String racePlace;
    private LocalDate raceDate;
    private  String winnerHorse;
    private  String secondPlaceHorse;
    private  String thirdPlaceHorse;
}
