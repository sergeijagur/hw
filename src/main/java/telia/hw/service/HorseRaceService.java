package telia.hw.service;

import org.springframework.stereotype.Service;
import telia.hw.service.race.RaceService;
import telia.hw.service.raceresults.RaceResultResponse;

import javax.annotation.Resource;

@Service
public class HorseRaceService {
    
    @Resource
    private RaceService raceService;


    public RaceResultResponse putBetOnHorse(RaceAndBetRequest request) {
       return raceService.putBetOnHorse(request);
    }
}
