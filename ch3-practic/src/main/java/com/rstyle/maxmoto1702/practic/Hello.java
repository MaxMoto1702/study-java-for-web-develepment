package com.rstyle.maxmoto1702.practic;

import com.rstyle.maxmoto1702.practic.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by maksim.serebryanskiy on 15.04.2015.
 */
@WebServlet(name = "Hello2",urlPatterns = "/hello2")
public class Hello extends HttpServlet {

    private static final Logger LOG = LoggerFactory.getLogger(Hello.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("userName");
        User user = new User(name);
        
        request.setAttribute("name", name);
        request.setAttribute("user", user);
        
        RequestDispatcher view = request.getRequestDispatcher("/result.jsp");
        view.forward(request, response);
    }
}
