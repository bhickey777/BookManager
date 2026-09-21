
package com.example.bookmanager.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmanager.dataModel.Book;
import com.example.bookmanager.services.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    public List<Book> getBook(@PathVariable Long id) {
        return bookService.findBook(id);
    }

    @GetMapping
    public List<Book> getBooks() {
        return bookService.getBooks();
    }
}