package com.example.my_first_api.controllers;

import com.example.my_first_api.services.AuthorService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class AuthorsController {

    private final AuthorService authorService;

    public AuthorsController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/author")
    public String getAuthor(Model model) {

        model.addAttribute("author", authorService.findAll());

        return "author";
    }
}
