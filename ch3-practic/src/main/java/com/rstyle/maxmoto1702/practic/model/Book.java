package com.rstyle.maxmoto1702.practic.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maksim.serebryanskiy on 15.04.2015.
 */
public class Book {

    private static final Logger LOG = LoggerFactory.getLogger(Book.class);
    
    private String name;
    private Author author;

    public Book() {
        this("");
    }

    public Book(String name) {
        this(name, null);
    }

    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
