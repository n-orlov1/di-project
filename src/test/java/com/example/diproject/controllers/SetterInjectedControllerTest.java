package com.example.diproject.controllers;

import com.example.diproject.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;


    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        assertEquals("Hello world!!", setterInjectedController.getGreeting());
        System.out.println(setterInjectedController.getGreeting());
    }
}