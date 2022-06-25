package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @RequestMapping("/calculator")
    public String calculator(ModelMap model, @RequestParam(name = "number1", defaultValue = "0") int number1, @RequestParam(name = "number2", defaultValue = "0") int number2, @RequestParam(name = "calculation", defaultValue = "") String caculator) {

        int result = 0;
        switch (caculator) {
            case "Addition(+)":
                result = number1 + number2;
                caculator = "Addition";
                break;
            case "Subtraction(-)":
                result = number1 - number2;
                caculator = "Subtraction";
                break;
            case "Multiplication(X)":
                result = number1 * number2;
                caculator = "Multiplication";
                break;
            case "Division(/)":
                result = number1 / number2;
                caculator = "Division";
                break;
        }
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("caculator", caculator);
        model.addAttribute("result", result);
        return "index";
    }
}

