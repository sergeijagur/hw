package telia.hw.service.horse;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;
import telia.hw.domain.horse.RaceHorsesRequest;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/horse")
public class HorseController {

    @Resource
    private HorseService horseService;

    @GetMapping("/id")
    @Operation(summary = "Find horse by id")
    public HorseInfoResponse getHorseById(@RequestParam Integer horseId) {
        return horseService.getHorseById(horseId);
    }

    @GetMapping("/user-id")
    @Operation(summary = "Find horse by user id")
    public List<HorseInfoResponse> getHorsesByUserId(@RequestParam Integer userId) {
        return horseService.getHorsesByUserId(userId);
    }

    @PostMapping("/new-horse")
    @Operation(summary = "Add new horse")
    public HorseInfoResponse addNewHorse(@RequestBody HorseInfoRequest request) {
        return horseService.addNewHorse(request);
    }

    @PostMapping("/race-horses")
    @Operation(summary = "Get race horses")
    public List<HorseInfoResponse> getRaceHorses(@RequestBody RaceHorsesRequest request) {
        return horseService.getRaceHorses(request);
    }

    @GetMapping("/all-horses")
    @Operation(summary = "Shows all registered horses")
    public List<HorseInfoResponse> findAllHorses() {
        return horseService.findAllHorses();
    }

    @GetMapping("/name-and-color")
    @Operation(summary = "Find horse name and color by id")
    public String findHorseInfoById(@RequestParam Integer horseId) {
        return horseService.findHorseInfoById(horseId);
    }
}
