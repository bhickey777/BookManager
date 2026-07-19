package com.example.services;

import org.springframework.stereotype.Service;
import com.example.dataModel.Book;
import com.example.dataServices.BookRepository;


@Service
public class BookService {

    private BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public Book findBook(Long id) {
        return repo.findById(id);
    }
}