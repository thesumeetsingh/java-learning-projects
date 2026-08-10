package com.sumeet.Log4JDemo.service;


import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GenerateWishesService implements IGreetService{

    @Override
    public String generateWishes(){
        LocalDateTime datetime= LocalDateTime.now();
        int h=datetime.getHour();

        String body=null;

        if(h<12){
            body="Good Morning";
        }else if(h<16){
            body="Good AfterNoon";
        }else if(h<20){
            body="Good Evening";
        }else{
            body="Good Night";
        }

        return body;
    }
}
