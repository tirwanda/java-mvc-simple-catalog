package com.subrutin.catalog.controller;

import com.subrutin.catalog.model.Book;
import com.subrutin.catalog.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
//        super();
        this.bookService = bookService;
    }

    @GetMapping("/list")
    public String findBookList(Model model) {
        List<Book> books = bookService.findBookAll();
        model.addAttribute("books", books);
        return "book/book-list";
    }
}
