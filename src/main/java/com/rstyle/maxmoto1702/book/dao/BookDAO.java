package com.rstyle.maxmoto1702.book.dao;

import com.rstyle.maxmoto1702.book.model.Book;
import com.rstyle.maxmoto1702.book.model.Category;

import java.util.List;

/**
 * Created by m on 13.04.2015.
 */
public interface BookDAO {

    List<Book> findAllBooks();

    List<Book> searchBooksByKeyword(String keyWord);

    List<Category> findAllCategories();

    void insert(Book book);

    void update(Book book);

    void delete(Long bookId);
}
