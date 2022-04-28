package telia.hw.domain.horse;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface HorseMapper {
    Horse horseInfoRequestToHorse(HorseInfoRequest horseInfoRequest);

    HorseInfoRequest horseToHorseInfoRequest(Horse horse);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateHorseFromHorseInfoRequest(HorseInfoRequest horseInfoRequest, @MappingTarget Horse horse);
}
