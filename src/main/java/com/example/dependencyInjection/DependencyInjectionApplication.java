package com.example.dependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dependencyInjection.controllers.ConstructorInjectedController;


@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		ConstructorInjectedController myController =  ctx.getBean(ConstructorInjectedController.class);
		
		System.out.println(myController.sayHello());
		
	}

}
