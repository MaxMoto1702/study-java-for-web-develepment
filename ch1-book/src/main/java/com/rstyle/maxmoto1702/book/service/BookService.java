package com.rstyle.maxmoto1702.book.service;

import com.rstyle.maxmoto1702.book.dao.BookDAO;
import com.rstyle.maxmoto1702.book.model.Book;

import java.util.List;

/**
 * Created by m on 18.04.2015.
 */
public class BookService {

    private BookDAO bookDao;

    public void setBookDao(BookDAO bookDao) {
        this.bookDao = bookDao;
    }

    public List<Book> getAllBooksList() {
        return bookDao.findAllBooks();
    }
}
