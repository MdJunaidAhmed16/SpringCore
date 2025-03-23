package com.example.dependencyInjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.dependencyInjection.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {
    
    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setup(){
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello(){
        System.out.println(propertyInjectedController.sayHello());
    }
}
