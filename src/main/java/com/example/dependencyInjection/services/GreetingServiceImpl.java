package com.example.dependencyInjection.services;

import org.springframework.stereotype.Service;

@Service("base")
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from the Greeting Impl";
    }
    
}
