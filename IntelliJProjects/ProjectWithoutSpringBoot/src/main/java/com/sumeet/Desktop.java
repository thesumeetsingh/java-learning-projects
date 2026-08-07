package com.sumeet;

public class Desktop implements Computer{
    public Desktop(){
        System.out.println("desktop constructor");
    }

    public void compile(){
        System.out.println("compiling in desktop");
    }
}
