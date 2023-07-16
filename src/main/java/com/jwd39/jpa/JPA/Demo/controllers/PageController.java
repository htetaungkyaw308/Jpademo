package com.jwd39.jpa.JPA.Demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/home")
    public String indexPage(){
        return "index";
    }

    @GetMapping("/about")
    public String aboutPage(){
        return "about";
    }

    @GetMapping("/pricing")
    public String pricingPage(){
        return "pricing";
    }

    @GetMapping("/features")
    public String featuresPage(){
        return "features";
    }

    @GetMapping("/contact")
    public String contactPage(){
        return "contact";
    }
}
