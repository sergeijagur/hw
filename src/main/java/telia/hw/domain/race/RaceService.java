package telia.hw.domain.race;

import org.springframework.stereotype.Service;
import telia.hw.domain.race_result.RaceResultResponse;
import telia.hw.service.RaceAndBetRequest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Random;


@Service
public class RaceService {

    @Resource
    private RaceMapper raceMapper;

    @Resource
    private RaceRepository raceRepository;



    public Integer addNewRace(RaceInfoRequest request) {
        raceRepository.save(raceMapper.raceInfoRequestToRace(request));
        return raceRepository.findByNameAndDate(request.getName(), request.getDate()).getId();
    }

    public Integer putBetOnHorse(RaceAndBetRequest request) {
        ArrayList raceHorses = request.getRaceHorses();
        Random random = new Random();
        int index = random.nextInt(raceHorses.size());
        int winnerId = Integer.parseInt(raceHorses.get(index).toString());



        return null;
    }
}
