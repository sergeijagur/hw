package telia.hw.domain.race;

import org.springframework.stereotype.Service;
import telia.hw.service.RaceAndBetRequest;

import javax.annotation.Resource;
import java.util.*;


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
        ArrayList<Integer> winnerIds = new ArrayList<>();
        for (int i = 0; i < raceHorses.size(); i++) {
            int index = random.nextInt(raceHorses.size());
            int chosenId = Integer.parseInt(raceHorses.get(index).toString());
            winnerIds.add(i, chosenId);
            raceHorses.remove(index);
        }
        Integer winner = winnerIds.get(0);
        Integer secondPlace = winnerIds.get(1);
        Integer thirdPlace = winnerIds.get(2);


        return winner;
    }
}
