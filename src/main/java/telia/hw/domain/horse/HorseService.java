package telia.hw.domain.horse;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HorseService {

    @Resource
    private HorseMapper horseMapper;

    @Resource
    private HorseRepository horseRepository;

    public void addNewHorse(HorseInfoRequest request) {
        Horse horse = horseMapper.horseDtoToHorse(request);
        horseRepository.save(horse);
    }
}
