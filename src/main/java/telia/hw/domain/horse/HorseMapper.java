package telia.hw.domain.horse;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface HorseMapper {
    @Mapping(source = "userId", target = "user.id")
    Horse horseInfoRequestToHorse(HorseInfoRequest horseInfoRequest);

    @Mapping(source = "user.id", target = "userId")
    HorseInfoRequest horseToHorseInfoRequest(Horse horse);

    @Mapping(source = "userId", target = "user.id")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateHorseFromHorseInfoRequest(HorseInfoRequest horseInfoRequest, @MappingTarget Horse horse);
}
