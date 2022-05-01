package telia.hw.service.user;

import org.springframework.stereotype.Service;
import telia.hw.domain.user.User;
import telia.hw.domain.user.UserMapper;
import telia.hw.domain.user.UserRepository;
import telia.hw.service.login.LoginResponse;
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

    public LoginResponse addNewUser(UserInfoRequest request) {
        Optional<User> existUser = userRepository.existUsername(request.getUsername());
        validationService.usernameExists(existUser);
        User user = userMapper.userInfoRequestToUser(request);
        User savedUser = userRepository.save(user);
        return userMapper.userToLoginResponse(savedUser);
    }

    public LoginResponse logInControl(String username, String password) {
        Optional<User> user = userRepository.logInControl(username, password);
        validationService.isLoginOk(user);
        return userMapper.userToLoginResponse(user.get());
    }
}
