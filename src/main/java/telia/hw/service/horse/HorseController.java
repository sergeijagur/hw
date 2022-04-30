package telia.hw.service.horse;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/horse")
public class HorseController {

    @Resource
    private HorseService horseService;

    @GetMapping("/id")
    @Operation(summary = "Find horse by id")
    public HorseInfoResponse getHorseById(Integer horseId) {
        return horseService.getHorseById(horseId);
    }


    @PostMapping("/new-horse")
    @Operation(summary = "Add new horse")
    public void addNewHorse(@RequestBody HorseInfoRequest request) {
        horseService.addNewHorse(request);
    }

    @GetMapping("/all-horses")
    @Operation(summary = "Shows all registered horses")
    public List<HorseInfoResponse> findAllHorses() {
        return horseService.findAllHorses();
    }
}
