package com.example.demo.controller;

import com.example.demo.entity.Bloger;
import com.example.demo.service.BlogerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class BlogerController {
    @Autowired
    private BlogerService bloggedService;

    @GetMapping("/create-blog")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("blog", new Bloger());
        return modelAndView;
    }

    @PostMapping("/blog-create")
    public String saveBlog(
            @ModelAttribute("blog") Bloger bloger,
            RedirectAttributes redirectAttributes
    ) {
        bloggedService.create(bloger);
        redirectAttributes.addFlashAttribute("message", "New create blog successfully");
        return "redirect:/";
    }

    @GetMapping("/")
    public ModelAndView listBlog() {
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("blog", bloggedService.findAll());
        return modelAndView;
    }

    @GetMapping("/blog/{id}/edit")
    public ModelAndView showEditBlog(
            @PathVariable("id") Integer id
    ) {
        Bloger blog = bloggedService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("blog", blog);
        return modelAndView;

    }

    @PostMapping("/blog-save")
    public String updateBlog(
            @ModelAttribute("blog") Bloger bloger,
            RedirectAttributes redirectAttributes
    ) {
        bloggedService.create(bloger);
//        ModelAndView modelAndView = new ModelAndView();
        redirectAttributes.addFlashAttribute("message", "Blog updated successfully");
        return "redirect:/";
    }

    @GetMapping("/blog/{id}/delete")
    public ModelAndView deleteBlog(
            @PathVariable("id") Integer id
    ) {
        Bloger bloger = bloggedService.findById(id);

        ModelAndView modelAndView = new ModelAndView("/delete");
        modelAndView.addObject("blog", bloger);
        return modelAndView;

    }

    @PostMapping("/blog-remove")
    public String removeBlog(
            @ModelAttribute("blog") Bloger bloger,
            RedirectAttributes redirectAttributes
    ) {
        bloggedService.delete(bloger.getId());
        redirectAttributes.addFlashAttribute("message", "Blog remove successfully");
        return "redirect:/";
    }

    @GetMapping("/blog/{id}/view")
    public ModelAndView viewBlog(
            @PathVariable("id") Integer id
    ) {
        Bloger bloger = bloggedService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/view");
        modelAndView.addObject("blog", bloger);
        return modelAndView;
    }

}

