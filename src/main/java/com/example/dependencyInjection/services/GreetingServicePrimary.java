package com.example.dependencyInjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("primary")
@Primary
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String sayGreeting() {
       return "Hello from Primary";
    }
    
}
