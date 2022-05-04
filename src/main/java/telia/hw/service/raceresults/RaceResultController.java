package telia.hw.service.raceresults;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/race-result")
public class RaceResultController {

    @Resource
    private RaceResultService raceResultService;

    @GetMapping("/all")
    @Operation(summary = "Find all race results")
    public List<ResultResponse> findAllRaceResults() {
        return raceResultService.findAllRaceResults();
    }

    @GetMapping("/id")
    @Operation(summary = "Find race result by race id")
    public ResultResponse findRaceResultById(Integer raceId) {
        return raceResultService.findRaceResultById(raceId);
    }
}
