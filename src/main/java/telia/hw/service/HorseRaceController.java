package telia.hw.service;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;
import telia.hw.domain.horse.HorseInfoRequest;
import telia.hw.domain.race.RaceInfoRequest;
import telia.hw.domain.race_result.RaceResultResponse;
import telia.hw.domain.user.UserInfoRequest;

import javax.annotation.Resource;
import javax.validation.Valid;


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
    public RaceResultResponse addNewRace(@Valid @RequestBody RaceInfoRequest request) {
        return horseRaceService.addNewRace(request);
    }

//    @PostMapping("/race-horses")
//    @Operation(summary = "Add horses to race")
//    public List<RaceHorse> addRaceHorses(Array [] horseId) {
//        Horse horse = new Horse();
//        ArrayList<Object> objects = new ArrayList<>();
//        objects.set(0, horse.getId());
//        return null;
//    }

    @PostMapping("/new-horse")
    @Operation(summary = "Add new horse")
    public void addNewHorse(@RequestBody HorseInfoRequest request) {
        horseRaceService.addNewHorse(request);
    }


}
