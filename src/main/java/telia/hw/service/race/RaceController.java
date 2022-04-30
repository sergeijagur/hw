package telia.hw.service.race;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/race")
public class RaceController {

    @Resource
    private RaceService raceService;


    @PostMapping("/new-race")
    @Operation(summary = "Add new race")
    public Integer addNewRace(@Valid @RequestBody RaceInfoRequest request) {
        return raceService.addNewRace(request);
    }
}
