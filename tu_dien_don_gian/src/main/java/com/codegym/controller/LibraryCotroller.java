package com.codegym.controller;

import bean.Library;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import reponsitory.impl.LibraryReponsitoryImpl;

import java.util.List;

@Controller
public class LibraryCotroller {
    private LibraryReponsitoryImpl libraryReponsitory = new LibraryReponsitoryImpl();

    @GetMapping("/search")
    public String search() {
        return "index";
    }

    @PostMapping("/result")
    public String meaning(@RequestParam String keyword, Model model) {
        List<Library> librarys = this.libraryReponsitory.findAll();
        for (int i = 0; i < librarys.size(); i++) {
            if (keyword.equalsIgnoreCase(librarys.get(i).getEnglish())) {
                model.addAttribute("word", librarys.get(i).getVietName());
                model.addAttribute("key", keyword);
                return "submit";
            }
        }
        return "submit";
    }
}


