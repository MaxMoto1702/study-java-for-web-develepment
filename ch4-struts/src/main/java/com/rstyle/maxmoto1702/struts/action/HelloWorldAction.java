package com.rstyle.maxmoto1702.struts.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maksim.serebryanskiy on 16.04.2015.
 */
@Action(value = "/hello", results = {@Result(name = "success", location = "/hello.jsp")})
public class HelloWorldAction {

    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldAction.class);

    private String name;

    public String execute() throws Exception {
        return "success";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
