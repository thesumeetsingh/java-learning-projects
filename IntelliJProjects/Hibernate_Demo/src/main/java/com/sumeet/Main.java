package com.sumeet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {


        Alien s= new Alien();
        s.setName("navin reddy");
        s.setId(03);
        s.setSubject("hibernate");

        Configuration config= new Configuration();
        config.addAnnotatedClass(Alien.class);
        config.configure();

        SessionFactory factory= config.buildSessionFactory();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Alien student=session.find(Alien.class, 03);
        System.out.println(student);

        session.merge( s);
        transaction.commit();

        session.close();
        factory.close();
    }
}
