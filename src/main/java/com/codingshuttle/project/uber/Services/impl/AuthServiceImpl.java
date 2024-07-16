package com.codingshuttle.project.uber.Services.impl;

import com.codingshuttle.project.uber.DTO.AuthSignupDTO;
import com.codingshuttle.project.uber.DTO.DriverDTO;
import com.codingshuttle.project.uber.DTO.UserDTO;
import com.codingshuttle.project.uber.Services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return null;
    }

    @Override
    public UserDTO signup(AuthSignupDTO signupdto) {
        return null;
    }

    @Override
    public DriverDTO onboardNewDriver(String userId) {
        return null;
    }
}
