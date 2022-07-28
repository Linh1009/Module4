package com.example.demo.service;

import com.example.demo.entity.Bloger;
import com.example.demo.entity.Category;

import java.util.List;

public interface CategoryService {
    void create(Category category);
    void update(Category category);
    void delete(int id);
    List<Category> findAll();
    Category findById(int id);
}
