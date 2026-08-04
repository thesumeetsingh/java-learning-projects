package com.sumeet.ProductApp.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @RequestMapping("/")
    public String getWelcome(){
        return "hello world";
    }

    @RequestMapping("about")
    public String about(){
        return "We dont teach, we educate!!!";
    }
}
