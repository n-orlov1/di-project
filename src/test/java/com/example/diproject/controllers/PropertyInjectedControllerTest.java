package com.example.diproject.controllers;

import com.example.diproject.services.ConstructorGreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();

        propertyInjectedController.greetingService = new ConstructorGreetingsServiceImpl();
    }

    @Test
    void getGreeting() {
        assertEquals("Hello world!!", propertyInjectedController.getGreeting());
        System.out.println(propertyInjectedController.getGreeting());
    }
}