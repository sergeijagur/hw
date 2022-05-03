package telia.hw.service.raceresults;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import telia.hw.domain.race.RaceRepository;
import telia.hw.domain.race_result.RaceResult;
import telia.hw.domain.race_result.RaceResultMapper;
import telia.hw.domain.race_result.RaceResultRepository;
import telia.hw.service.RaceAndBetRequest;
import telia.hw.service.horse.HorseService;

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
    private RaceResultMapper raceResultMapper;

    @Resource
    private HorseService horseService;


    public RaceResultResponse saveRaceResult(RaceAndBetRequest request, ArrayList<Integer> winners) {
        Integer winner = winners.get(0);
        Integer secondPlace = winners.get(1);
        Integer thirdPlace = winners.get(2);
        RaceResult raceResult = new RaceResult();
        raceResult.setRace(raceRepository.getById(request.getRaceId()));
        raceResult.setWinnerHorseId(winner);
        raceResult.setSecondPlaceHorseId(secondPlace);
        raceResult.setThirdPlaceHorseId(thirdPlace);
//        RaceResult savedRaceResult =
                raceResultRepository.save(raceResult);
        return raceResultMapper.raceResultToRaceResultResponse(raceResult);
    }

    public List<ResultResponse> findAllRaceResults() {
        List<RaceResult> allRaceResults = raceResultRepository.findAll();
        List<ResultResponse> responseList = getResultResponses(allRaceResults);
        return responseList;
    }

    public RaceResultResponse findRaceResultById(Integer raceId) {
        RaceResult raceResult = raceResultRepository.getById(raceId);
        return raceResultMapper.raceResultToRaceResultResponse(raceResult);
    }

    @NotNull
    private List<ResultResponse> getResultResponses(List<RaceResult> allRaceResults) {
        List<ResultResponse> responseList = new ArrayList<>();
        for (RaceResult result : allRaceResults) {
            ResultResponse response = new ResultResponse();
            response.setId(result.getId());
            response.setRaceId(result.getRace().getId());
            response.setRaceName(result.getRace().getName());
            response.setRacePlace(result.getRace().getPlace());
            response.setRaceDate(result.getRace().getDate());
            response.setWinnerHorse(horseService.findHorseInfoById(result.getWinnerHorseId()));
            response.setSecondPlaceHorse(horseService.findHorseInfoById(result.getSecondPlaceHorseId()));
            response.setThirdPlaceHorse(horseService.findHorseInfoById(result.getThirdPlaceHorseId()));
            responseList.add(response);
        }
        return responseList;
    }
}
