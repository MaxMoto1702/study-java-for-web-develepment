package com.rstyle.maxmoto1702.book.dao;

import com.rstyle.maxmoto1702.book.model.Author;
import com.rstyle.maxmoto1702.book.model.Book;
import com.rstyle.maxmoto1702.book.model.Category;
import com.rstyle.maxmoto1702.book.properties.DbProperties1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by m on 13.04.2015.
 */
public class BookDAOImpl implements BookDAO {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookDAOImpl.class);
    private static final DbProperties1 DB_PROPERTIES = new DbProperties1();

    static {
        try {
            Class.forName(DB_PROPERTIES.getDriver());
        } catch (ClassNotFoundException e) {
            LOGGER.error("Class '" + DB_PROPERTIES.getDriver() + "' not found", e);
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                DB_PROPERTIES.getUrl(),
                DB_PROPERTIES.getUsername(),
                DB_PROPERTIES.getPassword());
    }

    private void closeConnection(Connection connection) {
        if (connection == null) {
            return;
        }
        try {
            connection.close();
        } catch (SQLException e) {
            LOGGER.error("SQL error", e);
        }
    }

    public List<Book> findAllBooks() {
        List<Book> books = new ArrayList<Book>();
        List<Author> authors = new ArrayList<Author>();

        String sql = "SELECT * FROM BOOK INNER JOIN AUTHOR ON BOOK.ID = AUTHOR.BOOK_ID";

        Connection connection = null;
        try {
            connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Book book = new Book();
                Author author = new Author();

                book.setId(resultSet.getLong("id"));
                book.setBookTitle(resultSet.getString("book_title"));
                book.setCategoryId(resultSet.getLong("category_id"));

                author.setBookId(resultSet.getLong("book_Id"));
                author.setFirstName(resultSet.getString("first_name"));
                author.setLastName(resultSet.getString("last_name"));
                authors.add(author);

                book.setAuthors(authors);
                book.setPublisher(resultSet.getString("publisher"));
                books.add(book);
            }
        } catch (SQLException e) {
            LOGGER.error("SQL error", e);
        } finally {
            closeConnection(connection);
        }
        return books;
    }

    public List<Book> searchBooksByKeyword(String keyWord) {
        List<Book> books = new ArrayList<Book>();
        List<Author> authors = new ArrayList<Author>();

        String sql = "select * from book inner join author on book.id = author.book_id" +
                "      where book_title like '%" + keyWord.trim() + "%'" +
                "         or first_name like '%" + keyWord.trim() + "%'" +
                "         or last_name like '%" + keyWord.trim() + "%'";

        Connection connection = null;
        try {
            connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Book book = new Book();
                Author author = new Author();

                book.setId(resultSet.getLong("id"));
                book.setBookTitle(resultSet.getString("book_title"));
                book.setCategoryId(resultSet.getLong("category_id"));

                author.setBookId(resultSet.getLong("book_Id"));
                author.setFirstName(resultSet.getString("first_name"));
                author.setLastName(resultSet.getString("last_name"));
                authors.add(author);

                book.setAuthors(authors);
                book.setPublisher(resultSet.getString("publisher"));
                books.add(book);
            }
        } catch (SQLException e) {
            LOGGER.error("SQL error", e);
        } finally {
            closeConnection(connection);
        }
        return books;
    }

    public List<Category> findAllCategories() {
        List<Category> categories = new ArrayList<Category>();

        String sql = "SELECT * FROM CATEGORY";

        Connection connection = null;
        try {
            connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Category category = new Category();
                category.setId(resultSet.getLong("id"));
                category.setCategoryDescription(resultSet.getString("category_description"));
                categories.add(category);
            }
        } catch (SQLException e) {
            LOGGER.error("SQL error", e);
        } finally {
            closeConnection(connection);
        }
        return categories;
    }

    public void insert(Book book) {

    }

    public void update(Book book) {

    }

    public void delete(Long bookId) {

    }
}
