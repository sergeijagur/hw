package telia.hw.domain.horse;

import org.mapstruct.*;
import telia.hw.service.horse.HorseInfoRequest;
import telia.hw.service.horse.HorseInfoResponse;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface HorseMapper {
    @Mapping(source = "userId", target = "user.id")
    Horse horseInfoRequestToHorse(HorseInfoRequest horseInfoRequest);

    @Mapping(source = "user.id", target = "userId")
    HorseInfoRequest horseToHorseInfoRequest(Horse horse);

    HorseInfoResponse horseToHorseResponse(Horse horse);

    List <HorseInfoResponse> horsesToHorseResponses(List <Horse> horses);

    @Mapping(source = "userId", target = "user.id")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateHorseFromHorseInfoRequest(HorseInfoRequest horseInfoRequest, @MappingTarget Horse horse);
}
