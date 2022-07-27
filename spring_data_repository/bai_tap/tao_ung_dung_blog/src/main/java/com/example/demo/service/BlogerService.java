package com.example.demo.service;

import com.example.demo.entity.Bloger;

import java.util.List;

public interface BlogerService {
    void create(Bloger bloger);
    void update(Bloger bloger);
    void delete(int id);
    List<Bloger> findAll();
    Bloger findById(int id);
}
