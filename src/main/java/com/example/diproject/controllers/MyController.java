package com.example.diproject.controllers;

import com.example.diproject.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello() {
        System.out.println("Hello world!");
        return "Hey!!";
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
