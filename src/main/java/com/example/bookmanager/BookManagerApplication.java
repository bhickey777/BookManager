package com.example.bookmanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * spring boot application for book manager
 */
@SpringBootApplication
public class BookManagerApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(BookManagerApplication.class, args);
    }

}
