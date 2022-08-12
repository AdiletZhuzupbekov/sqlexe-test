package com.example.sqlexe.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "printer")
public class Printer {
    @Id
    Integer code;
    @ManyToOne
    @JoinColumn(name = "model")
    Product product;
    char color;
    @Column(length = 10)
    String type;
    double price;
}

