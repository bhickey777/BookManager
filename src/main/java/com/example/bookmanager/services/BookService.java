package com.example.bookmanager.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;

import com.example.bookmanager.dataModel.Book;
import com.example.bookmanager.dataServices.BookRepository;

import java.util.List;
import java.util.ArrayList;


@Service
public class BookService {

    private static final Logger log = LoggerFactory.getLogger(BookService.class);

    private BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public List<Book> findBook(Long id) {
        log.info("Attempting to find a boook with id of " + id);
        return repo.findById(id);
    }

    public List<Book> getBooks(){
        return this.repo.findBooks();
    }
}