package telia.hw.service;

import org.springframework.stereotype.Service;
import telia.hw.domain.horse.Horse;
import telia.hw.domain.horse.HorseInfoRequest;
import telia.hw.domain.horse.HorseInfoResponse;
import telia.hw.domain.horse.HorseService;
import telia.hw.domain.race.RaceInfoRequest;
import telia.hw.domain.race.RaceService;
import telia.hw.domain.race_result.RaceResultResponse;
import telia.hw.domain.user.UserInfoRequest;
import telia.hw.domain.user.UserService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HorseRaceService {

    @Resource
    private UserService userService;

    @Resource
    private RaceService raceService;

    @Resource
    private HorseService horseService;

    public void addNewUser(UserInfoRequest request) {
        userService.addNewUser(request);
    }

    public Integer addNewRace(RaceInfoRequest request) {
       return raceService.addNewRace(request);
    }

    public void addNewHorse(HorseInfoRequest request) {
        horseService.addNewHorse(request);
    }

    public List<HorseInfoResponse> findAllHorses() {
        return horseService.findAllHorses();
    }


    public RaceResultResponse putBetOnHorse(RaceAndBetRequest request) {
       return raceService.putBetOnHorse(request);
    }
}
