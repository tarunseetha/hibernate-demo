package com.learning.hibernatedemo.hibernatedemo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
@Data
public class Product {

    @Id
    private int pid;

    private String name;

    private int quantity;

    private double price;
}
