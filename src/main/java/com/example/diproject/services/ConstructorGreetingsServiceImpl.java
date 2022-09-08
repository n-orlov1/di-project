package com.example.diproject.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingsServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world - from Constructor controller!!";
    }
}
