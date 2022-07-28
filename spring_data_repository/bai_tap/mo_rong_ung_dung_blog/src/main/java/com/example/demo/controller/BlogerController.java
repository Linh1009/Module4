package com.example.demo.controller;

import com.example.demo.entity.Bloger;
import com.example.demo.entity.Category;
import com.example.demo.service.BlogerService;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.awt.print.Pageable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller

public class BlogerController {
    @Autowired
    BlogerService blogerService;

    @Autowired
    CategoryService categoryService;
    @ModelAttribute("categorys")
    public Iterable<Category> categories() {
        return categoryService.findAll();
    }

    @GetMapping("/create-blog")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("blog", new Bloger());
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public ModelAndView createBlog(@ModelAttribute("blog") Bloger blog) {
        blogerService.create(blog);

        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("message", "Blog created compliment");
        return modelAndView;
    }

    @GetMapping("/update-blog/{id}")
    public ModelAndView showUpdateForm(@PathVariable int id) {
        Bloger blog = blogerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }

    @PostMapping("/update-blog")
    public ModelAndView updateBlog(@ModelAttribute("blog") Bloger blog) {
        blogerService.update(blog);

        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("message", "Blog updated compliment");
        return modelAndView;
    }


    @PostMapping("/delete-blog")
    public String deleteBlog(@ModelAttribute("blog") Bloger blog) {
        blogerService.delete(blog.getId());

        return "redirect:blogs";
    }

    @GetMapping("/view-blog/{id}")
    public ModelAndView detailInformationBlog(@PathVariable int id) {
        Bloger blog = blogerService.findById(id);

        ModelAndView modelAndView = new ModelAndView("/view");
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }

    @PostMapping("/edit-blog")
    public ModelAndView update(@ModelAttribute("blog") Bloger bloger) {
        blogerService.update(bloger);

        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("blog", bloger);
        modelAndView.addObject("message", "Updated blog successfully");
        return modelAndView;
    }

    @GetMapping("/delete-blog/{id}")
    public ModelAndView showDeleteForm(@PathVariable int id) {
        Bloger bloger = blogerService.findById(id);

        ModelAndView modelAndView = new ModelAndView("/delete");
        modelAndView.addObject("blog", bloger);
        return modelAndView;

    }

    @PostMapping("/delete-blog")
    public String delete(@ModelAttribute("blog") Bloger bloger) {
        blogerService.delete(bloger.getId());
        return "redirect:blogers";
    }

    @GetMapping("/view-blog/{id}")
    public ModelAndView view(@PathVariable int id) {
        Bloger bloger = blogerService.findById(id);


        ModelAndView modelAndView = new ModelAndView("/view");
        modelAndView.addObject("blog", bloger);
        return modelAndView;
    }
}
