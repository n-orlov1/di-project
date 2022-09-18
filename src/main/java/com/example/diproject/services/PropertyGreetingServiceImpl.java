package com.example.diproject.services;

import org.springframework.stereotype.Service;

//@Service
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world- from property controller!!";
    }
}
