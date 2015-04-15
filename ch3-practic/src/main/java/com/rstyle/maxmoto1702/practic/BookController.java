package com.rstyle.maxmoto1702.practic;

import com.rstyle.maxmoto1702.book.dao.BookDAO;
import com.rstyle.maxmoto1702.book.dao.BookDAOImpl;
import com.rstyle.maxmoto1702.book.model.Book;
import com.rstyle.maxmoto1702.book.model.Category;
import com.rstyle.maxmoto1702.practic.model.Author;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by m on 14.04.2015.
 */
public class BookController extends HttpServlet {

    private static final Logger LOG = LoggerFactory.getLogger(BookController.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Author author = new Author("Vishal Layka");
        com.rstyle.maxmoto1702.practic.model.Book book = new com.rstyle.maxmoto1702.practic.model.Book("Learn Java for Web Development", author);
        String[] categories = {"Clojure", "Groovy", "Java" , "Scala"} ;
        Map<String, String> books = new HashMap<>();
        books.put("Groovy", "Beginning Groovy");
        books.put("Java", " Beginning Java");
        books.put("Scala", " Beginning Scala");
        
        request.setAttribute("books", books);
        request.setAttribute("java", "Java");
        request.setAttribute("categories", categories);
        request.setAttribute("book", book);

        HttpSession session = request.getSession();
        Integer pageLoadingCount = (Integer) (session.getAttribute("pageLoadingCount"));
        pageLoadingCount = pageLoadingCount == null ? 1 : pageLoadingCount + 1;
        session.setAttribute("pageLoadingCount", pageLoadingCount);
        
        String userName = "max";
        Cookie cookie = new Cookie("userName", userName);
        response.addCookie(cookie);
        
        RequestDispatcher view = request.getRequestDispatcher("/book.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
