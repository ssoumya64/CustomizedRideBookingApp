package com.codingshuttle.project.uber.Services.impl;

import com.codingshuttle.project.uber.DTO.AuthSignupDTO;
import com.codingshuttle.project.uber.DTO.DriverDTO;
import com.codingshuttle.project.uber.DTO.UserDTO;
import com.codingshuttle.project.uber.Entities.User;
import com.codingshuttle.project.uber.Entities.enums.Roles;
import com.codingshuttle.project.uber.Exceptions.RuntimeConflictException;
import com.codingshuttle.project.uber.Repositories.UserRepository;
import com.codingshuttle.project.uber.Services.AuthService;
import com.codingshuttle.project.uber.Services.RiderService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final ModelMapper modelmapper;

    private final UserRepository userrepository;

    private final RiderService riderservice;

    @Override
    public String login(String email, String password) {
        return null;
    }

    @Override
    @Transactional
    public UserDTO signup(AuthSignupDTO signupdto) {
        User byEmail = userrepository.findByEmail(signupdto.getEmail()).orElse(null);
                if(byEmail !=null){
                    throw new RuntimeConflictException("Can not signup User with "+signupdto.getEmail()+" already exist");
                }
              User user = modelmapper.map(signupdto, User.class);
        user.setRoles(Set.of(Roles.RIDER));
        User saveduser = userrepository.save(user);

    //Create user related entities
        riderservice.createNewRider(saveduser);

        return modelmapper.map(saveduser,UserDTO.class);
    }

    @Override
    public DriverDTO onboardNewDriver(String userId) {
        return null;
    }
}
