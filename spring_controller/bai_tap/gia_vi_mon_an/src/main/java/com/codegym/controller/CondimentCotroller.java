package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CondimentCotroller {
    @RequestMapping("/condiment")
    public String Index() {
        return "index";
    }


    @GetMapping(path = "/list")
    public String save(
            @RequestParam("condiment") String[] condiment, Model model
    ) {
        model.addAttribute("condiment", condiment);
        return "list";
    }
}
