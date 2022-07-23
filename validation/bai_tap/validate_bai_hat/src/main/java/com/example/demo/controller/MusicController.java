package com.example.demo.controller;

import com.example.demo.entity.Music;
import com.example.demo.validator.NgheSiValidator;
import com.example.demo.validator.TenValidator;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MusicController {

    @GetMapping("/start")
    ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("/form");
        modelAndView.addObject("user", new Music());
        return modelAndView;
    }

    @PostMapping("/validate")
    public String checkValidation(@Validated @ModelAttribute("user") Music music, BindingResult bindingResult) {
        new NgheSiValidator().validate(music.getNgheSi(), bindingResult);
        new TenValidator().validate(music.getTen(), bindingResult);

        if (bindingResult.hasFieldErrors())
            return "/form";
        else {
            return "/result";
        }
    }
}
