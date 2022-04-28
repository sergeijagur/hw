package telia.hw.service;

import org.springframework.stereotype.Service;
import telia.hw.domain.horse.HorseInfoRequest;
import telia.hw.domain.horse.HorseService;
import telia.hw.domain.race.RaceInfoRequest;
import telia.hw.domain.race.RaceService;
import telia.hw.domain.user.UserInfoRequest;
import telia.hw.domain.user.UserService;

import javax.annotation.Resource;

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

    public void addNewRace(RaceInfoRequest request) {
        raceService.addNewRace(request);
    }

    public void addNewHorse(HorseInfoRequest request) {
        horseService.addNewHorse(request);
    }
}
