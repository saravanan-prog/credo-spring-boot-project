package com.firstSpringproject.demoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoAppApplication implements CommandLineRunner {

	@Autowired
	private Employee e;

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoAppApplication.class, args);
		Employee e = (Employee) context.getBean(Employee.class);
		String data = e.toString();
		System.out.println("Hi  My First spring boot project" + data);

	}

		public void run(String... args) throws  Exception{
			System.out.println(e.toString());
			System.out.println(e.getSalary());
		}

}
