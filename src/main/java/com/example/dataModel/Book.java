package com.example.dataModel;

public class Book {

    private String name = "Unknown";
    private Long id = (long)-1.0;

    public Book(String name) {
        this.name = name;
    }
    public Book(Long id) {
        this.name = "Test Book";
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public Long getId() {
        return this.id;
    }
}