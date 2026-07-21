package com.sumeet.IOCDIProject;


import org.springframework.stereotype.Component;

@Component
public class Student {

    private String name;
    private int rollNo;

    public Student(){
        this.name= "default name";
        this.rollNo= 01;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void study(){
        System.out.println("student is studying...");
    }
}
