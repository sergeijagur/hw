package telia.hw.service;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;
import telia.hw.domain.horse.HorseInfoRequest;
import telia.hw.domain.race.RaceInfoRequest;
import telia.hw.domain.user.UserInfoRequest;

import javax.annotation.Resource;

@RestController
@RequestMapping("/horse-race")
public class HorseRaceController {

    @Resource
    private HorseRaceService horseRaceService;

    @PostMapping("/new-user")
    @Operation(summary = "Add new user")
    public void addNewUser(@RequestBody UserInfoRequest request) {horseRaceService.addNewUser(request);
    }

    @PostMapping("/new-race")
    @Operation(summary = "Add new race")
    public void addNewRace(@RequestBody RaceInfoRequest request) {
        horseRaceService.addNewRace(request);
    }

    @PostMapping("/new-horse")
    @Operation(summary = "Add new horse")
    public void addNewHorse(@RequestBody HorseInfoRequest request) {
        horseRaceService.addNewHorse(request);
    }

}
