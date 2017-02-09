package com.bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by markopaivarinta on 2/9/17.
 */
@Controller
public class BookController {

    @RequestMapping(value="/index", method= RequestMethod.GET)
    public String index() {
        return "index";
    }

    //@RequestMapping(value="/hello", method=RequestMethod.POST) }

}
