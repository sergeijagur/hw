package telia.hw.service.race;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import telia.hw.domain.race.Race;
import telia.hw.domain.race.RaceMapper;
import telia.hw.domain.race.RaceRepository;
import telia.hw.service.raceresults.RaceResultResponse;
import telia.hw.service.raceresults.RaceResultService;
import telia.hw.service.RaceAndBetRequest;
import telia.hw.validation.ValidationService;

import javax.annotation.Resource;
import java.util.*;


@Service
public class RaceService {

    @Resource
    private RaceMapper raceMapper;

    @Resource
    private RaceRepository raceRepository;

    @Resource
    private RaceResultService raceResultService;


    public RaceInfoResponse addNewRace(RaceInfoRequest request) {
        Race savedRace = raceRepository.save(raceMapper.raceInfoRequestToRace(request));
        return raceMapper.raceToResponse(savedRace);
    }

    public RaceResultResponse putBetOnHorse(RaceAndBetRequest request) {
        ArrayList <Integer> winners = getWinners(request);
        RaceResultResponse raceResultResponse = raceResultService.saveRaceResult(request, winners);
        Integer winner = winners.get(0);
        if (request.getBetOnHorseId().equals(winner)) {
            raceResultResponse.setWin(true);
        }
        return raceResultResponse;
    }

    private @NotNull
    ArrayList <Integer> getWinners(RaceAndBetRequest request) {
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


}
