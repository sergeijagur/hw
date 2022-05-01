package telia.hw.domain.user;

import org.mapstruct.*;
import telia.hw.service.login.LoginResponse;
import telia.hw.service.user.UserInfoRequest;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {
    User userInfoRequestToUser(UserInfoRequest userInfoRequest);

    UserInfoRequest userToUserInfoRequest(User user);


    LoginResponse userToLoginResponse(User user);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateUserFromUserInfoRequest(UserInfoRequest userInfoRequest, @MappingTarget User user);
}
