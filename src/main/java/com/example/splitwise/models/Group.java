package com.example.splitwise.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@Table(name = "groups")
public class Group extends BaseModel{
    private String name;

    @ManyToMany
    private List<User> participants;

    @ManyToMany
    private List<User> admins;

    private String description;

    @ManyToOne
    private User createdBy;

    @OneToMany
    private List<Expense> expenses;
}
