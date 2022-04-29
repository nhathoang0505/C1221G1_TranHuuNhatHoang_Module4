package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping(value = "/homepage")
    public String homePage() {
        return "homepage";
    }

    @GetMapping(value = "/convert")
    public String convertToUsd(@RequestParam Integer vnd, Model model) {
        double usd = vnd / 23000;
        model.addAttribute("usd", usd);
        return "homepage";
    }
}
