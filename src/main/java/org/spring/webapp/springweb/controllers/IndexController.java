package org.spring.webapp.springweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    // This method is mapped with three endpoints: {"", "/", "/index", "/home"}
    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        // this value has to match with HTML file name under resources/templates
        return "index";
    }
}
