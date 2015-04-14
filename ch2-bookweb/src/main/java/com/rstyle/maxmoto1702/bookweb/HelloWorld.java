package com.rstyle.maxmoto1702.bookweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by maksim.serebryanskiy on 14.04.2015.
 */
@WebServlet(urlPatterns = {"/HelloWorld"}, description = "A hello world servlet")
public class HelloWorld extends HttpServlet {

    private static final Logger LOG = LoggerFactory.getLogger(HelloWorld.class);
    private static final long SERIAL_VERSION_UID = 1L;

    public HelloWorld() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOG.debug("Request: " + request);
        try {
            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");
            PrintWriter writer = response.getWriter();
            writer.println("<h2>");
            writer.println("Hello World! Макс");
            writer.println("</h2>");
        } catch (IOException e) {
            LOG.error("Input/output error", e);
        }
        LOG.debug("Response: " + response);
    }
}
