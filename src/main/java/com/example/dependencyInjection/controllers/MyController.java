package com.example.dependencyInjection.controllers;

import org.springframework.stereotype.Controller;

import com.example.dependencyInjection.services.GreetingService;
import com.example.dependencyInjection.services.GreetingServiceImpl;

@Controller
public class MyController {
    
    // This is an example where dependencies are used without injection

    private GreetingService greetingService;

    public MyController(){
        this.greetingService = new GreetingServiceImpl();
    }
    public String sayHello(){
        
        System.out.println("Hello from the controller");

        return greetingService.sayGreeting();
    }
}
