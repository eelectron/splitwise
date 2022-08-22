package com.example.splitwise.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "users")
public class User extends BaseModel{
    private String username;
    private String hashedPassword;
    private String phoneNumber;
}
