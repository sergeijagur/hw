package telia.hw.domain.horse;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HorseService {

    @Resource
    private HorseMapper horseMapper;

    @Resource
    private HorseRepository horseRepository;

    public void addNewHorse(HorseInfoRequest request) {
        Horse horse = horseMapper.horseInfoRequestToHorse(request);
        horseRepository.save(horse);
    }

    public List<HorseInfoResponse> findAllHorses() {
        List<Horse> allHorses = horseRepository.findAll();
        horseMapper.

    }
}
