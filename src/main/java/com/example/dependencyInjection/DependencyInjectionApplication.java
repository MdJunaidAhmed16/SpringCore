package com.example.dependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dependencyInjection.controllers.i18N.My18NController;


@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		My18NController myController =  ctx.getBean(My18NController.class);
		
		System.out.println(myController.sayHello());
		
	}

}
