package com.rstyle.maxmoto1702.practic.listener; 

import com.rstyle.maxmoto1702.practic.filter.SimpleFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Created by maksim.serebryanskiy on 16.04.2015.
 */

public class SimpleListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleFilter.class);

    // Public constructor is required by servlet spec
    public SimpleListener() {
        LOGGER.debug("Constructing Simple Listener");
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed). 
         You can initialize servlet context related data here.
      */
        LOGGER.debug("Initialization Simple Listener");
    }

    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
        LOGGER.debug("Destroying Simple Listener");
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent se) {
      /* Session is created. */
        LOGGER.debug("Session creating");
    }

    public void sessionDestroyed(HttpSessionEvent se) {
      /* Session is destroyed. */
        LOGGER.debug("Session destroying");
    }

    // -------------------------------------------------------
    // HttpSessionAttributeListener implementation
    // -------------------------------------------------------

    public void attributeAdded(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute 
         is added to a session.
      */
    }

    public void attributeRemoved(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute
         is removed from a session.
      */
    }

    public void attributeReplaced(HttpSessionBindingEvent sbe) {
      /* This method is invoked when an attibute
         is replaced in a session.
      */
    }
}
