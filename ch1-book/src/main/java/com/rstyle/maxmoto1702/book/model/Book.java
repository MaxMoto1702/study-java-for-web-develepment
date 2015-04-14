package com.rstyle.maxmoto1702.book.model;

import java.util.List;

/**
 * Created by m on 13.04.2015.
 */
public class Book {
    private Long id;
    private Long categoryId;
    private String bookTitle;
    private List<Author> authors;
    private String publisher;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", categoryId=" + categoryId +
                ", bookTitle='" + bookTitle + '\'' +
                ", authors=" + authors +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
