package telia.hw.domain.race;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RaceMapper {


    Race raceInfoRequestToRace(RaceInfoRequest request);

}
