package com.firstattempt.Myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyprojectApplication {

	public static void main(String[] args) {
	System.out.println("start of the project");
	
		SpringApplication.run(MyprojectApplication.class, args);
		System.out.println("progress of the project");
	}

}
