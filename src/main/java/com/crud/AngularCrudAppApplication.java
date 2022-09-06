package com.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.crud.controller")
public class AngularCrudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularCrudAppApplication.class, args);
	}

}
