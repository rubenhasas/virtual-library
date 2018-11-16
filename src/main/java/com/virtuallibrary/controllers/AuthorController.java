package com.virtuallibrary.controllers;

import com.virtuallibrary.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping({"/authors", "/authors/index", "/authors/index.html"})
    public String listAuthors(Model model){

        model.addAttribute("authors", authorService.findAll());

        return "authors/index";
    }
}
