package telia.hw.service;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;
import telia.hw.domain.horse.Horse;
import telia.hw.domain.horse.HorseInfoRequest;
import telia.hw.domain.horse.HorseInfoResponse;
import telia.hw.domain.race.RaceInfoRequest;
import telia.hw.domain.race_result.RaceResultResponse;
import telia.hw.domain.user.UserInfoRequest;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/horserace")
public class HorseRaceController {

    @Resource
    private HorseRaceService horseRaceService;



    @PostMapping("/new-user")
    @Operation(summary = "Add new user")
    public void addNewUser(@RequestBody UserInfoRequest request) {horseRaceService.addNewUser(request);
    }

    @PostMapping("/new-race")
    @Operation(summary = "Add new race")
    public Integer addNewRace(@Valid @RequestBody RaceInfoRequest request) {
        return horseRaceService.addNewRace(request);
    }

    @PostMapping("/new-horse")
    @Operation(summary = "Add new horse")
    public void addNewHorse(@RequestBody HorseInfoRequest request) {
        horseRaceService.addNewHorse(request);
    }

    @GetMapping("/all-horses")
    @Operation(summary = "Shows all registered horses")
    public List<HorseInfoResponse> findAllHorses() {
        return horseRaceService.findAllHorses();
    }

    @PostMapping("/bet")
    @Operation(summary = "Add horses to race")
    public Integer putBetOnHorse(@RequestBody RaceAndBetRequest request) {
       return horseRaceService.putBetOnHorse(request);
    }

}
