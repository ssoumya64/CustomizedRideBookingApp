package com.codingshuttle.project.uber.Controller;

import com.codingshuttle.project.uber.DTO.AuthSignupDTO;
import com.codingshuttle.project.uber.DTO.UserDTO;
import com.codingshuttle.project.uber.Services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authservice;

    @PostMapping("/signup")
    UserDTO signUp(@RequestBody AuthSignupDTO signupdto){
        return authservice.signup(signupdto);
    }
}
