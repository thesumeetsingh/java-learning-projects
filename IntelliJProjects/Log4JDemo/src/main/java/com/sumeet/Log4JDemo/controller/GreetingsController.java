package com.sumeet.Log4JDemo.controller;


import com.sumeet.Log4JDemo.service.IGreetService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    private static Logger logger= LogManager.getLogger(GreetingsController.class);
    @Autowired
    private IGreetService service;

    @GetMapping("/api1")
    public ResponseEntity<String> generateGreetings(){
        logger.info("REQUESTED ACCEPTED FOR /api1");
        String body=service.generateWishes();
        logger.debug("GOT MESSAGE BODY FROM SERVICE");

        return new ResponseEntity<String>(body, HttpStatus.OK);
    }

}
