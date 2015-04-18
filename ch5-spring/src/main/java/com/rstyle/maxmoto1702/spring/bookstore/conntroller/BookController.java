package com.rstyle.maxmoto1702.spring.bookstore.conntroller;

import com.rstyle.maxmoto1702.book.service.BookService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by m on 18.04.2015.
 */
public class BookController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        BookService service = new BookService();
        ModelAndView view = new ModelAndView("bookList");
        view.addObject("bookList", service.getAllBooksList());
        return view;
    }
}
