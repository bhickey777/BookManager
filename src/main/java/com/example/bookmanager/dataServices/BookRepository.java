package com.example.bookmanager.dataServices;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.bookmanager.dataModel.Book;
import com.example.bookmanager.mappers.BookRowMapper;

@Repository
public class BookRepository {

    private final JdbcTemplate jdbcTemplate;

    public BookRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> findById(Long id) {
        return jdbcTemplate.query(
                "select id, title, author from listed_books where id = " + id,
                new BookRowMapper()
        );
    }

    public List<Book> findBooks() {
        return jdbcTemplate.query(
                "select id, title, author from listed_books",
                new BookRowMapper()
        );
    }

    public int countBooks() {
        return jdbcTemplate.queryForObject(
                "select count(*) from listed_books",
                Integer.class
        );
    }
}
