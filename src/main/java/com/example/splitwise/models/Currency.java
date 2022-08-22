package com.example.splitwise.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "currencies")
public class Currency extends BaseModel{
    private String name;
}
