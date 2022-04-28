package telia.hw.domain.user;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {

    User requestInfoToUserInfo(UserInfoRequest request);

}
