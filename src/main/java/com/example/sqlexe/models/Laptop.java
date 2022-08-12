package com.example.sqlexe.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "laptop")
public class Laptop {

    @Id
    Integer code;
    @ManyToOne
            @JoinColumn(name = "model")
            Product product;
    int speed;
    int ram;
    double hd;
    double price;
    int screen;

}

