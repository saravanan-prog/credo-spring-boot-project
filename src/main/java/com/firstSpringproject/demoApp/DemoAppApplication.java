package com.firstSpringproject.demoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAppApplication implements CommandLineRunner  {

	@Autowired
	private Employee e;

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
	}

	public void run(String... args) throws  Exception{
		System.out.println(e.toString());
		System.out.println(e.getSalary());
	}

}
