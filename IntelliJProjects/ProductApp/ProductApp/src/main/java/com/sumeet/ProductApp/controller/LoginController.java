package com.sumeet.ProductApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "<h1>Login Page</h1> <h3> welcome user</h3>";
    }
}
