package telia.hw.service;

import lombok.Data;
import java.util.ArrayList;

@Data
public class RaceAndBetRequest {
    private final Integer raceId;
    private final Integer userId;
    private final Integer betOnHorseId;
    private final ArrayList raceHorses;
}
