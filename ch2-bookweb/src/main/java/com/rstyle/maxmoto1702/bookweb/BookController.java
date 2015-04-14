package com.rstyle.maxmoto1702.bookweb;

import com.rstyle.maxmoto1702.book.dao.BookDAO;
import com.rstyle.maxmoto1702.book.dao.BookDAOImpl;
import com.rstyle.maxmoto1702.book.model.Book;
import com.rstyle.maxmoto1702.book.model.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by m on 14.04.2015.
 */
public class BookController extends HttpServlet {

    public static final String BOOKS = "books";
    private static final Logger LOG = LoggerFactory.getLogger(BookController.class);
    private static final String CATEGORIES = "categories";

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        // initilization list categories
        BookDAO bookDAO = new BookDAOImpl();
        List<Category> categories = bookDAO.findAllCategories();
        ServletContext context = config.getServletContext();
        context.setAttribute(CATEGORIES, categories);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String jspDirectory = "/jsp";
        String url = jspDirectory + "/home.jsp";
        String action = request.getParameter("action");
        String category = request.getParameter("category");
        String keyword = request.getParameter("keyword");

        if (action != null) {
            switch (action) {
                case "allBooks":
                    findAllBooks(request, response);
                    url = jspDirectory + "/listOfBooks.jsp";
                    break;
                case "category":
                    findAllBooks(request, response);
                    url = jspDirectory + "/categories.jsp?category=" + category;
                    break;
                case "search":
                    searchBooks(request, response, keyword);
                    url = jspDirectory + "/searchResult.jsp";
                    break;
            }
        }

        LOG.debug("URL before get request dispatcher: " + url);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    private void findAllBooks(HttpServletRequest request, HttpServletResponse response) {
        try {
            LOG.debug("Loading all books from DB...");
            BookDAO bookDAO = new BookDAOImpl();
            List<Book> books = bookDAO.findAllBooks();
            request.setAttribute(BOOKS, books);
            LOG.debug("Loading success");
        } catch (Exception e) {
            LOG.error("Error when get all books from DB", e);
            throw e;
        }
    }

    private void searchBooks(HttpServletRequest request, HttpServletResponse response, String keyword) {
        try {
            BookDAO bookDAO = new BookDAOImpl();
            List<Book> books = bookDAO.searchBooksByKeyword(keyword);
            request.setAttribute(BOOKS, books);
        } catch (Exception e) {
            LOG.error("Error when search books in DB by keyword", e);
            throw e;
        }
    }
}
