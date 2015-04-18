package com.rstyle.maxmoto1702.spring.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by m on 19.04.2015.
 */
@Controller("/hello.html")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView helloController() {
        ModelAndView view = new ModelAndView("hello");
        view.addObject("str", "string");
        return view;
    }
}
