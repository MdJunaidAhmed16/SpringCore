package com.example.dependencyInjection.services.i18N;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.dependencyInjection.controllers.i18N.My18NController;
import com.example.dependencyInjection.services.GreetingService;

@Profile("En")
@Service("i18N")
public class EnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello in English";
    }
    
    
}
