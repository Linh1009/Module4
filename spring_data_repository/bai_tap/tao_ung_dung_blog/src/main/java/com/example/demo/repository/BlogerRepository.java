package com.example.demo.repository;

import com.example.demo.entity.Bloger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogerRepository extends JpaRepository<Bloger,Integer> {
}
