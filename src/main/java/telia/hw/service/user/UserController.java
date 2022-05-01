package telia.hw.service.user;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import telia.hw.service.login.LoginResponse;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/new-user")
    @Operation(summary = "Add new user")
    public LoginResponse addNewUser(@RequestBody UserInfoRequest request) {return userService.addNewUser(request);
    }
}
