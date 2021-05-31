package com.praveenavsm.spring5jokesappv2.controller;

import com.praveenavsm.spring5jokesappv2.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getJokes(Model model){
        model.addAttribute("joke",jokeService.getJoke());

        return "index";
    }
}
