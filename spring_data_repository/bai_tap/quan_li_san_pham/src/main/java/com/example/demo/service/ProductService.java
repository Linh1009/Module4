package com.example.demo.service;

import com.example.demo.entity.Product;

import java.util.List;

public interface ProductService {
    void create(Product product);
    void update(Product product);
    void delete(int id);
    List<Product> findAll();
    Product findById(int id);

}
