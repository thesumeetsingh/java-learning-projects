package com.sumeet.SpringOAuth2Demo;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(){
        return "hellow world, welcome to OAuth2 Spring Demo project";
    }
}
