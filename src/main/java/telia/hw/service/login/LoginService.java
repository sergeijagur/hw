package telia.hw.service.login;


import org.springframework.stereotype.Service;
import telia.hw.service.user.UserService;

import javax.annotation.Resource;

@Service
public class LoginService {

    @Resource
    private UserService userService;


    public LoginResponse logIn(String username, String password) {
        return userService.logInControl(username, password);

    }
}
