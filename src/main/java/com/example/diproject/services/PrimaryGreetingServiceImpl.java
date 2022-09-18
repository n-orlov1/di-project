package com.example.diproject.services;


//@Primary
//@Service
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world - from primary greeting service!!";
    }
}
