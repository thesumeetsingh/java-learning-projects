package com.sumeet;

public class Dev {
    private Computer comp;
//    private int age;


    public Dev(){
        System.out.println("dev constructor");
    }

    public Dev(Computer comp){
        this.comp=comp;
        System.out.println("parameterised dev constructor with computer");
    }

//    public Dev(int age){
//        this.age=age;
//        System.out.println("parameterised dev constructor with age");
//    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public void build(){

        System.out.println("building this project without springboot");
        comp.compile();

    }
}
