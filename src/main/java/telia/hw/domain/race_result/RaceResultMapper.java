package telia.hw.domain.race_result;

import org.mapstruct.*;
import telia.hw.service.raceresults.RaceResultResponse;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RaceResultMapper {
    @Mapping(source = "raceName", target = "race.name")
    @Mapping(source = "racePlace", target = "race.place")
    @Mapping(source = "raceDate", target = "race.date")
    RaceResult raceResultDtoToRaceResult(RaceResultResponse raceResultResponse);

    @InheritInverseConfiguration(name = "raceResultDtoToRaceResult")
    RaceResultResponse raceResultToRaceResultResponse(RaceResult raceResult);



    List< RaceResultResponse> raceResultsToResponses(List <RaceResult> raceResult);



    @InheritConfiguration(name = "raceResultDtoToRaceResult")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateRaceResultFromRaceResultDto(RaceResultResponse raceResultResponse, @MappingTarget RaceResult raceResult);
}
