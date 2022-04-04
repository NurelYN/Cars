package com.aacademy.homework.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cars")
public class Car {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name="brand",nullable=false)
    private String brand;

    @NotNull
    @Column(name="year",nullable=false)
    private int year;

    @NotNull
    @Column(name="price",nullable=false)
    private double price;

}
