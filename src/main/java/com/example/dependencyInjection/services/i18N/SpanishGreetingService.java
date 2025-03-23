package com.example.dependencyInjection.services.i18N;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.dependencyInjection.services.GreetingService;

@Profile("ES")
@Service("i18N")
public class SpanishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hola in Spanish";
    }
    
}
