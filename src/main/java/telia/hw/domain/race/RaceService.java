package telia.hw.domain.race;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RaceService {

    @Resource
    private RaceMapper raceMapper;

    @Resource
    private RaceRepository raceRepository;

    public void addNewRace(RaceInfoRequest request) {
        Race race = raceMapper.raceInfoRequestToRace(request);
        raceRepository.save(race);
    }
}
