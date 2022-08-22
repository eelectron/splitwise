package com.example.splitwise.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "expenses")
public class Expense extends BaseModel{
    private Double amount;

    @ManyToOne
    private User createdBy;

    private String description;

    @ManyToOne
    Currency baseCurrency;

    @ManyToMany
    List<User> participants;
}
