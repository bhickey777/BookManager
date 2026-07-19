package com.example.dataServices;

import com.example.dataModel.*;

public class BookRepository {

    public Book findById(Long id) {
        return new Book(id);
    }
}