package telia.hw.service.raceresults;

import org.springframework.stereotype.Service;
import telia.hw.domain.race.RaceRepository;
import telia.hw.domain.race_result.RaceResult;
import telia.hw.domain.race_result.RaceResultMapper;
import telia.hw.domain.race_result.RaceResultRepository;
import telia.hw.service.RaceAndBetRequest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class RaceResultService {

    @Resource
    private RaceRepository raceRepository;

    @Resource
    private RaceResultRepository raceResultRepository;

    @Resource
    RaceResultMapper raceResultMapper;


    public RaceResultResponse saveRaceResult(RaceAndBetRequest request, ArrayList<Integer> winners) {
        Integer winner = winners.get(0);
        Integer secondPlace = winners.get(1);
        Integer thirdPlace = winners.get(2);
        RaceResult raceResult = new RaceResult();
        raceResult.setRace(raceRepository.getById(request.getRaceId()));
        raceResult.setWinnerHorseId(winner);
        raceResult.setSecondPlaceHorseId(secondPlace);
        raceResult.setThirdPlaceHorseId(thirdPlace);
        RaceResult savedRaceResult = raceResultRepository.save(raceResult);
        return raceResultMapper.raceResultToRaceResultResponse(savedRaceResult);
    }

    public List<RaceResultResponse> findAllRaceResults() {
        List<RaceResult> allRaceResults = raceResultRepository.findAll();
        return raceResultMapper.raceResultsToResponses(allRaceResults);
    }

    public RaceResultResponse findRaceResultById(Integer raceId) {
        RaceResult raceResult = raceResultRepository.getById(raceId);
        return raceResultMapper.raceResultToRaceResultResponse(raceResult);
    }
}
