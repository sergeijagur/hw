package telia.hw.service;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;
import telia.hw.service.raceresults.RaceResultResponse;

import javax.annotation.Resource;


@RestController
@RequestMapping("/horse-race")
public class HorseRaceController {

    @Resource
    private HorseRaceService horseRaceService;

    @PostMapping("/bet")
    @Operation(summary = "Send race horses list, bet and race info to race")
    public RaceResultResponse putBetOnHorse(@RequestBody RaceAndBetRequest request) {
       return horseRaceService.putBetOnHorse(request);
    }

}
