package com.example.diproject.services;

import org.springframework.stereotype.Service;

//@Service
public class SetterGreetingsServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world- from setter controller!!";
    }
}
