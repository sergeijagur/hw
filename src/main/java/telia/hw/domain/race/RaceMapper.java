package telia.hw.domain.race;

import org.mapstruct.*;
import telia.hw.service.race.RaceInfoRequest;
import telia.hw.service.race.RaceInfoResponse;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RaceMapper {

    @Mapping(source = "userId", target = "user.id")
    Race raceInfoRequestToRace(RaceInfoRequest raceDto);

    @Mapping(source = "user.id", target = "userId")
    RaceInfoRequest raceToRaceDto(Race race);

    RaceInfoResponse raceToResponse(Race race);

    @Mapping(source = "userId", target = "user.id")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateRaceFromRaceDto(RaceInfoRequest raceDto, @MappingTarget Race race);
}
