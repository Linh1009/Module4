package com.example.demo.controller;

import com.example.demo.entity.Bloger;
import com.example.demo.service.BlogerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogRestController {

    @Autowired
    private BlogerService blogService;

    @GetMapping(value = "/api/blog")
    public ResponseEntity<Iterable<Bloger>> listAllBlog() {
        Iterable<Bloger> blogs = blogService.findAll();
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @PostMapping(value = "/api/blog/{id}")
    public ResponseEntity<Bloger> detailBlog(@PathVariable("id") int id) {
        Bloger blogDetail = blogService.findById(id);
        if (blogDetail == null) return new ResponseEntity<Bloger>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(blogDetail, HttpStatus.OK);
    }


}
