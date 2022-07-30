package com.codegym.controller;

import com.codegym.entity.FormYTe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller

public class FormController {
    @GetMapping("/form")
    public String showForm (Model model) {
        model.addAttribute("email", new FormYTe());
        return "form";
    }

    @PostMapping("/result")
    public String showResult (@ModelAttribute("email") FormYTe formYTe, ModelMap model) {
        model.addAttribute("ten", formYTe.getTen());
        model.addAttribute("namSinh", formYTe.getNamSinh());
        model.addAttribute("gioiTinh", formYTe.isGioiTinh());
        model.addAttribute("quocTich", formYTe.getQuocTich());
        model.addAttribute("cmnd", formYTe.getCmnd());
        model.addAttribute("diLai", formYTe.getDiLai());
        model.addAttribute("soHieuPhuongTien", formYTe.getSoHieuPhuongTien());
        model.addAttribute("ngayKhoiHanh", formYTe.getNgayKhoiHanh());
        model.addAttribute("tinhThanhPhoDaDi", formYTe.getTinhThanhPhoDaDi());

        return "result";
    }

}
