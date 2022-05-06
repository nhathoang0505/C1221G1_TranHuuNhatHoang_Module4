package com.example.controller;

import com.example.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    ICalculatorService calculatorService;

    @GetMapping("/")
    public String goHomePage() {
        return "index";
    }

    @GetMapping("/calculator")
    public String calculate(@RequestParam(defaultValue = "") Integer number1, @RequestParam(defaultValue = "") Integer number2,
                            @RequestParam String operator, Model model) {
        String result = calculatorService.calculate(number1, number2, operator);
        model.addAttribute("result", result);
        return "index";
    }
}
