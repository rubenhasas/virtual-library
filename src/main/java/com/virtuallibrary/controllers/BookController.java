package com.virtuallibrary.controllers;

import com.virtuallibrary.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping({"/books", "/books/index", "/books/index.html"})
    public String listBooks(Model model){

        model.addAttribute("books", bookService.findAll());

        return "books/index";
    }
}
