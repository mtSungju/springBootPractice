package com.example.springBootPractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/greetings")
    public String greetings(Model model){
        model.addAttribute("userName","sungju");
        return "greetings";
    }

    @GetMapping("/bye")
    public String bye(Model model){
        model.addAttribute("nickName","BeerKing");
        return "goodbye";
    }



}
