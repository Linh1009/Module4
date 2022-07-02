package com.codegym.sevice.impl;

import com.codegym.entity.Product;
import com.codegym.reponsitory.ProductReponsitoryImpl;
import com.codegym.sevice.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductReponsitoryImpl productReponsitory = new ProductReponsitoryImpl();
    @Override
    public List<Product> findAll() {
        return productReponsitory.findAll();
    }

    @Override
    public void save(Product product) {
        productReponsitory.save(product);

    }

    @Override
    public Product findById(int id) {
        return productReponsitory.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        productReponsitory.update(id, product);
    }

    @Override
    public void remove(int id) {
        productReponsitory.remove(id);
    }
}
