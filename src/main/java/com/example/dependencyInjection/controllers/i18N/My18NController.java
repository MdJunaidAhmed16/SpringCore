package com.example.dependencyInjection.controllers.i18N;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.dependencyInjection.services.GreetingService;

@Controller
public class My18NController {

    private GreetingService greetingService;

    My18NController(@Qualifier("i18N") GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
    
}
