package com.rstyle.maxmoto1702.book;

import com.rstyle.maxmoto1702.book.dao.BookDAO;
import com.rstyle.maxmoto1702.book.dao.BookDAOImpl;
import com.rstyle.maxmoto1702.book.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Hello world!
 */
public class BookApp {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookApp.class);
    private static BookDAO bookDAO = new BookDAOImpl();

    public static void main(String[] args) {
        LOGGER.info("Listing all books");
        findAlBooks();
        LOGGER.info("Search book by keyword 'Groovy'");
        searchByKeyword("Groovy");
        LOGGER.info("Search book by keyword 'Josh'");
        searchByKeyword("Josh");
    }

    private static void findAlBooks() {
        List<Book> books = bookDAO.findAllBooks();
        show(books);
    }

    private static void searchByKeyword(String keword) {
        List<Book> books = bookDAO.searchBooksByKeyword(keword);
        show(books);
    }

    private static void show(List<Book> books) {
        for (Book book : books) {
            LOGGER.info(book.toString());
        }
    }
}
