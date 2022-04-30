package telia.hw.domain.race;

import org.mapstruct.*;
import telia.hw.service.race.RaceInfoRequest;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RaceMapper {

    Race raceInfoRequestToRace(RaceInfoRequest raceDto);

    @Mapping(source = "user.id", target = "userId")
    RaceInfoRequest raceToRaceDto(Race race);

    @Mapping(source = "userId", target = "user.id")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateRaceFromRaceDto(RaceInfoRequest raceDto, @MappingTarget Race race);
}
