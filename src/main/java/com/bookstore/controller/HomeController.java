package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by YAN on 3/1/17.
 */
//register this class as a controller bean in spring container
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
