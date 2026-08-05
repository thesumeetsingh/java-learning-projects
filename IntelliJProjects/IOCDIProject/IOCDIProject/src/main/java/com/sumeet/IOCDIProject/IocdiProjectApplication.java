package com.sumeet.IOCDIProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IocdiProjectApplication {

	public static void main(String[] args) {


//		ApplicationContext context=SpringApplication.run(IocdiProjectApplication.class, args);
//		Student s= context.getBean(Student.class);
//		s.study();

		SpringApplication.run(IocdiProjectApplication.class, args);

	}

}
