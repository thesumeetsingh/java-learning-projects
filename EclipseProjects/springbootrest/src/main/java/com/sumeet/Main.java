package com.sumeet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String args[]) {
		
		Student s1= new Student();
		s1.setUsername("abcdef");
		s1.setFirstname("abc");
		s1.setLastname("abc");
		s1.setCity("abc");
		s1.setPhone("abc");
		s1.setEmail("abc");
		s1.setPassword("abc");
		Configuration configuration = new Configuration();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session= factory.openSession();
		
		session.persist(s1);
	}
}
