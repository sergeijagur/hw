package telia.hw.domain.user;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {
    User userInfoRequestToUser(UserInfoRequest userInfoRequest);

    UserInfoRequest userToUserInfoRequest(User user);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateUserFromUserInfoRequest(UserInfoRequest userInfoRequest, @MappingTarget User user);
}
