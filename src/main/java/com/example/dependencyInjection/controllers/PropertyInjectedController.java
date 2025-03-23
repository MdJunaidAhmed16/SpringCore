package com.example.dependencyInjection.controllers;

import com.example.dependencyInjection.services.GreetingService;

public class PropertyInjectedController {
    
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
