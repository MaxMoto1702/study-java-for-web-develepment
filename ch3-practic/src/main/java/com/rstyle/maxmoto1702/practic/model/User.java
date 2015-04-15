package com.rstyle.maxmoto1702.practic.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maksim.serebryanskiy on 15.04.2015.
 */
public class User {

    private static final Logger LOG = LoggerFactory.getLogger(User.class);
    
    private String name = "default name";

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
