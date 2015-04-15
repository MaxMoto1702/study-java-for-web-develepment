package com.rstyle.maxmoto1702.practic.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maksim.serebryanskiy on 15.04.2015.
 */
public class Author {

    private static final Logger LOG = LoggerFactory.getLogger(Author.class);
    
    private String name;

    public Author() {
        this("");
    }

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
