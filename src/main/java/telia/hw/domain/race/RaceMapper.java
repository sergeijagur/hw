package telia.hw.domain.race;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RaceMapper {
//    @Mapping(source = "race.name", target = "raceName")
//    @Mapping(source = "race.place", target = "racePlace")
//    @Mapping(source = "race.date", target = "raceDate")
    Race raceInfoRequestToRace(RaceInfoRequest raceDto);

    @Mapping(source = "user.id", target = "userId")
    RaceInfoRequest raceToRaceDto(Race race);

    @Mapping(source = "userId", target = "user.id")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateRaceFromRaceDto(RaceInfoRequest raceDto, @MappingTarget Race race);
}
