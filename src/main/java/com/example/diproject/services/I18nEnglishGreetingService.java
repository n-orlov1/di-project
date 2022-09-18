package com.example.diproject.services;


//@Profile("english")
//@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world - from I18nEnglishGreetingService!!";
    }
}
