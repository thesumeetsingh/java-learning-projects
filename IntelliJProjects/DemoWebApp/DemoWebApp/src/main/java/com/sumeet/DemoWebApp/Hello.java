package com.sumeet.DemoWebApp;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello{

    @RequestMapping("/")
    public String hello(){
        return "Hello World, welcome to first spring boot demo project";
    }
}