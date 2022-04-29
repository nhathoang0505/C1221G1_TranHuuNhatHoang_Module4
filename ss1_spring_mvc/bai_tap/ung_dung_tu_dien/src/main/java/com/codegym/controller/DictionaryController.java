package com.codegym.controller;

import com.codegym.service.ITranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    ITranslateService translateService;

    @GetMapping(value = "/homepage")
    public String homepage() {
        return "home";
    }

    @GetMapping(value = "/translate")
    public String translate(@RequestParam String keyword, Model model) {
        String result = translateService.translateToEnglish(keyword);
        model.addAttribute("results", result);
        return "home";
    }
}
