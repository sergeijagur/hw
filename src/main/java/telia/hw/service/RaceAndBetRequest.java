package telia.hw.service;

import lombok.Data;
import java.util.ArrayList;

@Data
public class RaceAndBetRequest {
    private Integer raceId;
    private Integer userId;
    private Integer betOnHorseId;
    private ArrayList raceHorses;
}
