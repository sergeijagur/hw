package telia.hw.domain.user;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserRepository userRepository;

    public void addNewUser(UserInfoRequest request) {
        User user = userMapper.userInfoRequestToUser(request);
        userRepository.save(user);
    }
}
