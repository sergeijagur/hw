package telia.hw.service.horse;

import org.springframework.stereotype.Service;
import telia.hw.domain.horse.*;
import telia.hw.validation.ValidationService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class HorseService {

    @Resource
    private HorseMapper horseMapper;

    @Resource
    private HorseRepository horseRepository;

    @Resource
    private ValidationService validationService;

    public HorseInfoResponse addNewHorse(HorseInfoRequest request) {
        Optional<Horse> optionalHorse = horseRepository.existsByName(request.getName());
        validationService.horseNameExists(optionalHorse);
        Horse horse = horseMapper.horseInfoRequestToHorse(request);
        Horse savedHorse = horseRepository.save(horse);
        return horseMapper.horseToHorseResponse(savedHorse);
    }

    public List<HorseInfoResponse> findAllHorses() {
        List<Horse> allHorses = horseRepository.findAll();
        return horseMapper.horsesToHorseResponses(allHorses);
    }

    public HorseInfoResponse getHorseById(Integer horseId) {
        Horse horse = horseRepository.getById(horseId);
       return horseMapper.horseToHorseResponse(horse);
    }

    public String findHorseInfoById(Integer horseId) {
        Horse horse = horseRepository.getById(horseId);
        return horse.getName() + horse.getColor();

    }
}
