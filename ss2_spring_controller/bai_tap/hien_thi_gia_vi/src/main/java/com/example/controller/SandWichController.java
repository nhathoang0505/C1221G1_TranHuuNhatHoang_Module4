package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandWichController {
    @GetMapping("/sandwich")
    public String goHomePage() {
        return "index";
    }

    @GetMapping("/save")
    public String showList(@RequestParam(defaultValue = "") String[] condiment, Model model) {
        model.addAttribute("condiment", condiment);
        return "index";
    }
}
