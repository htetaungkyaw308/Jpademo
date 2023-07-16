package com.jwd39.jpa.JPA.Demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("/user/create")
    public String userCreateGet(){
        return "usercreate";
    }

    @PostMapping("/user/create")
    public String userCreatePost(){
        return "usercreate";
    }

    @GetMapping("/user/view")
    public String userViewGet(){
        return "userview";
    }

    @PostMapping("/user/view")
    public String userViewPost(){
        return "userview";
    }
}
