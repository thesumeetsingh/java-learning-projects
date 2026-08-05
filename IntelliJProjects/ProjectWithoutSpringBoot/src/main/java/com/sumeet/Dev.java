package com.sumeet;

public class Dev {

    private int age;


    public Dev(){
        System.out.println("dev constructor");
    }
    public int getAge() {
        return age;
    }

    public Dev(int age){
        this.age=age;
        System.out.println("parameterised dev constructor");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void build(){

        System.out.println("building this project without springboot");

    }
}
