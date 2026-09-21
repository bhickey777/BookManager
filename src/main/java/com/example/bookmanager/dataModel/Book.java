package com.example.bookmanager.dataModel;

public class Book {

    private String author = "Unknown";
    private String name = "Unknown";
    private String title = "Unknown";

    private Long id = (long)-1.0;

    public Book() {}
    public Book(String name) {
        this.name = name;
    }
    public Book(Long id) {
        this.name = "Test Book";
        this.id = id;
    }

    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) { this.author = author; }

    public String getName() {
        return this.name;
    }
    public void setName(String name) { this.name = name; }

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) { this.id = id; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}