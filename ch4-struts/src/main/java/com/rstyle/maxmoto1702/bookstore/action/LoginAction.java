package com.rstyle.maxmoto1702.bookstore.action;

import com.opensymphony.xwork2.ActionSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maksim.serebryanskiy on 16.04.2015.
 */
public class LoginAction extends ActionSupport {

    private static final Logger LOG = LoggerFactory.getLogger(LoginAction.class);
    private String username;
    private String password;

    public String execute() {
        if (this.username.equalsIgnoreCase("Max") && this.password.equals("password")) {
            return "success";
        } else {
            addActionError(getText("error.login"));
            return "error";
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
