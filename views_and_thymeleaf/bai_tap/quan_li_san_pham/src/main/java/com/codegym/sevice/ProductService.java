package com.codegym.sevice;

import com.codegym.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void remove(int id);

    void update(int id, Product product);
}
