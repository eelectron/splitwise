package com.example.splitwise.services;

import com.example.splitwise.models.User;
import com.example.splitwise.repositories.UserRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class UserService {
    @Inject
    private UserRepository userRepository;

    public User registerUser(String userName, String hashedPassword, String phoneNumber){
        User user = new User(userName, hashedPassword, phoneNumber);
        User savedUser = userRepository.save(user);
        return savedUser;
    }
}
