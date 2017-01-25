package com.letiko.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {

    @RequestMapping("/")
    String index() {
        System.err.println("hello");
        return "index";
    }
}
