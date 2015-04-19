package com.rstyle.maxmoto1702.spring.bookstore.conntroller;

import com.rstyle.maxmoto1702.book.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by m on 18.04.2015.
 */
@Controller(value = "/list-book.html")
public class BookController {

    private BookService bookService;

    public BookService getBookService() {
        return bookService;
    }

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView bookListController() {
        ModelAndView view = new ModelAndView("bookList");
        view.addObject("bookList", bookService.getAllBooksList());
        return view;
    }
}
