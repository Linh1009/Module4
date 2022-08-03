package com.example.demo.entity;

import javax.persistence.*;


import javax.persistence.*;

@Entity
public class Bloger {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String blogName;
    private String content;
    private String fileType;

    @ManyToOne
    @JoinColumn(name = "blogcategory_id")
    private Category category;

    public Bloger() {
    }

    public Bloger(int id, String blogName, String content, String fileType, Category category) {
        this.id = id;
        this.blogName = blogName;
        this.content = content;
        this.fileType = fileType;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
