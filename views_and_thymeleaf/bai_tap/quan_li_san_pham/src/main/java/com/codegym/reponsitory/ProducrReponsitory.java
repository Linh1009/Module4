package com.codegym.reponsitory;

import com.codegym.entity.Product;

import java.util.List;

public interface ProducrReponsitory {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void remove(int id);

    void update(int id, Product product);

}
