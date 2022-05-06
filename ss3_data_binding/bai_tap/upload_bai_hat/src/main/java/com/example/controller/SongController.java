package com.example.controller;

import com.example.model.Song;
import com.example.service.impl.SongServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SongController {
    @Autowired
    SongServiceImpl songService;

    @GetMapping("/")
    public String display(Model model) {
        model.addAttribute("list", this.songService.songList());
        return "list";
    }

    @GetMapping("/upload")
    public String upload(Model model) {
        model.addAttribute("upload", new Song());
        return "upload";
    }



    @PostMapping("/result")
    public String result(@ModelAttribute Song song) {
        this.songService.save(song);
        return "redirect:/";
    }


}
