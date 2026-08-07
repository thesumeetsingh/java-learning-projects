package com.sumeet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        Dev developer= (Dev)context.getBean("dev");
//        developer.build();
//        developer.setAge(21);
//        System.out.println("devevloper age: "+developer.getAge());

//        Dev dev2=(Dev)context.getBean("dev2");
//        System.out.println("dev 2 age: "+dev2.getAge());

//        System.out.println( "Hello World!" );
//        Dev dev = new Dev();
//
//        dev.build();

//        developer.build();

        Dev lapDev= (Dev) context.getBean("devLap");
        Dev deskDev= (Dev) context.getBean("devDesk");

        lapDev.build();
        deskDev.build();
    }
}
