package com.sumeet.IOCDIProject;


import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    public void compile(){
        System.out.println("compiling faster in desktop");
    }
}
