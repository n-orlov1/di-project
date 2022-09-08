package com.example.diproject.controllers;

import com.example.diproject.services.ConstructorGreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingsServiceImpl());
    }

    @Test
    void getGreeting() {
        assertEquals("Hello world!!", constructorInjectedController.getGreeting());
        System.out.println(constructorInjectedController.getGreeting());
    }
}