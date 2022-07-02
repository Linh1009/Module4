package com.codegym.controller;

import com.codegym.entity.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailController {
    @GetMapping("/form")
    public String showForm (Model model) {
        model.addAttribute("email", new Email());
        return "form";
    }

    @PostMapping("/result")
    public String showResult (@ModelAttribute("email") Email email, ModelMap model) {
        model.addAttribute("languages", email.getLanguages());
        model.addAttribute("pageSize", email.getPageSize());
        model.addAttribute("filter", email.isSpamsFilter());
        model.addAttribute("signature", email.getSignature());
        return "result";
    }
}