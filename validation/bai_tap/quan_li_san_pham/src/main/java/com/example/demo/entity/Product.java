package com.example.demo.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Product {
    @Id
    @Column(name = "id_product")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotEmpty
    @Length(min = 2, max = 45)
    private String name;
    @NotEmpty
    @Size(min = 2)
    private double price;
    @NotEmpty
    @Length(min = 2, max = 45)

    private String description;

    public Product() {
    }

    public Product(int id, @NotEmpty @Length(min = 2, max = 45) String name, @NotEmpty @Size(min = 2) double price, @NotEmpty @Length(min = 2, max = 45) String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
