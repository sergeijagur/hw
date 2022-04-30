package telia.hw.domain.race;

import org.springframework.stereotype.Service;
import telia.hw.domain.race_result.RaceResult;
import telia.hw.domain.race_result.RaceResultResponse;
import telia.hw.domain.race_result.RaceResultService;
import telia.hw.service.RaceAndBetRequest;

import javax.annotation.Resource;
import java.util.*;


@Service
public class RaceService {

    @Resource
    private RaceMapper raceMapper;

    @Resource
    private RaceRepository raceRepository;

    @Service
    private RaceResultService raceResultService;



    public Integer addNewRace(RaceInfoRequest request) {
        raceRepository.save(raceMapper.raceInfoRequestToRace(request));
        return raceRepository.findByNameAndDate(request.getName(), request.getDate()).getId();
    }

    public RaceResultResponse putBetOnHorse(RaceAndBetRequest request) {
        ArrayList <Integer> winners = getWinners(request);
        RaceResultResponse raceResultResponse = raceResultService.saveRaceResult(request, winners);
        Integer winner = winners.get(0);

        return raceResultService.ge;
    }

    private ArrayList <Integer> getWinners(RaceAndBetRequest request) {
        ArrayList raceHorses = request.getRaceHorses();
        Random random = new Random();
        ArrayList<Integer> winnerIds = new ArrayList<>();
        for (int i = 0; i < raceHorses.size(); i++) {
            int index = random.nextInt(raceHorses.size());
            int chosenId = Integer.parseInt(raceHorses.get(index).toString());
            winnerIds.add(i, chosenId);
            raceHorses.remove(index);
        }
        return winnerIds;
    }

    public Race findRaceById(Integer raceId) {
        return findRaceById(raceId);
    }
}
