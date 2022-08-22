package com.example.splitwise.controllers;

import com.example.splitwise.dtos.RegisterUserRequestDto;
import com.example.splitwise.dtos.RegisterUserResponseDto;
import com.example.splitwise.models.User;
import com.example.splitwise.services.UserService;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class UserController {

    @Inject
    private UserService userService;

    public RegisterUserResponseDto registerUser(RegisterUserRequestDto request){
        User user = userService.registerUser(request.getUsername(), request.getPassword(), request.getPhoneNumber());

        // create response
        RegisterUserResponseDto response = new RegisterUserResponseDto();
        response.setUsername(user.getUsername());
        response.setPassword(user.getUsername());
        response.setPhoneNumber(user.getPhoneNumber());
        return response;
    }
}
