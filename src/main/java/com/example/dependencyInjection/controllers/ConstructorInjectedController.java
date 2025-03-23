package com.example.dependencyInjection.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.dependencyInjection.services.GreetingService;

@Controller
// As I am adding this annotation spring takes care of the required objects to inject.
// It injects all the objects declared in the constructor
public class ConstructorInjectedController {
    
    private final GreetingService greetingService;

    // This is the preferred method
    ConstructorInjectedController(@Qualifier("base") GreetingService greetingService){
        this.greetingService = greetingService;
        // how this would work.
        // controller = new ConstructorController(new GreetingServiceImpl) 
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
