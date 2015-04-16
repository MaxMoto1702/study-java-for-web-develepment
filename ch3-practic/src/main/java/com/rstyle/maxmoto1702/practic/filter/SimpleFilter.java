package com.rstyle.maxmoto1702.practic.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by maksim.serebryanskiy on 16.04.2015.
 */
@WebFilter(servletNames = "Hello2")
public class SimpleFilter implements Filter {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleFilter.class);
    
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        LOGGER.debug("Тут что-то фильтруется");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
