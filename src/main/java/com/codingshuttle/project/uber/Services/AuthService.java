package com.codingshuttle.project.uber.Services;

import com.codingshuttle.project.uber.DTO.AuthSignupDTO;
import com.codingshuttle.project.uber.DTO.DriverDTO;
import com.codingshuttle.project.uber.DTO.UserDTO;

public interface AuthService {
    String login(String email, String password);
    UserDTO signup(AuthSignupDTO signupdto);

    DriverDTO onboardNewDriver(String userId);

}
