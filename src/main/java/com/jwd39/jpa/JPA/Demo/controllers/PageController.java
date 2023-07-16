package com.jwd39.jpa.JPA.Demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/home")
    public String indexPage(){
        return "index";
    }
}
