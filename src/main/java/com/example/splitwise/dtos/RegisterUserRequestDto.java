package com.example.splitwise.dtos;

import lombok.Data;

@Data
public class RegisterUserRequestDto {
    private String username;
    private String password;
    private String phoneNumber;
}
