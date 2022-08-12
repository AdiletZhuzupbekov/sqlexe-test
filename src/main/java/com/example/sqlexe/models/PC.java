package com.example.sqlexe.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "pc")
public class PC {

    @Id
    Integer code;
    @ManyToOne
    @JoinColumn(name = "model")
    Product product;
    int speed;
    int ram;
    int hd;
    @Column(length = 10)
    String cd;
    double price;
}

