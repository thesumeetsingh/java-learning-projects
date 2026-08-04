package com.springJDBCDemo.demo;

import com.springJDBCDemo.demo.AlienRepo.AlienRepository;
import com.springJDBCDemo.demo.Model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {


		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		Alien alien=context.getBean(Alien.class);
		alien.setId(4);
		alien.setName("abc def");
		alien.setTech("science");

		AlienRepository repo=context.getBean(AlienRepository.class);
		repo.save(alien);

		System.out.println(repo.findAll());
	}

}
