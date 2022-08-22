package com.example.splitwise.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "expensepayingusers")
public class ExpensePayingUser extends BaseModel{
    @ManyToOne
    private Expense expense;

    @ManyToOne
    private User user;

    private Double amount;
}
