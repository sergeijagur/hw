package telia.hw.service.user;

import org.springframework.stereotype.Service;
import telia.hw.domain.user.User;
import telia.hw.domain.user.UserMapper;
import telia.hw.domain.user.UserRepository;
import telia.hw.service.user.UserInfoRequest;
import telia.hw.validation.ValidationService;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserRepository userRepository;

    @Resource
    private ValidationService validationService;

    public void addNewUser(UserInfoRequest request) {
        Optional<User> existUser = userRepository.existUsername(request.getUsername());
        validationService.usernameExists(existUser);

        User user = userMapper.userInfoRequestToUser(request);
        userRepository.save(user);
    }

    public Integer logInControl(String username, String password) {
        Optional<User> user = userRepository.logInControl(username, password);
        validationService.isLogiOk(user);
        return user.get().getId();
    }
}
