package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
import javax.persistence.*;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String categoryName;

    @OneToMany(targetEntity = Bloger.class)
    private List<Bloger> blogs;


    public Category() {
    }

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Bloger> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Bloger> blogs) {
        this.blogs = blogs;
    }
}
