package telia.hw.service.login;


import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/log-in")
public class LoginController {

    @Resource
    private LoginService loginService;


    @GetMapping
    @Operation(summary = "Log in")
    public Integer logIn(@RequestParam String username, @RequestParam String password) {
        return loginService.logIn(username, password);
    }

}
