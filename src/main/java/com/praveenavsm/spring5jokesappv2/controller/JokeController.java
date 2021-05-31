package com.praveenavsm.spring5jokesappv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    @RequestMapping("/")
    public String getJokes(Model model){

        return "index";
    }
}
