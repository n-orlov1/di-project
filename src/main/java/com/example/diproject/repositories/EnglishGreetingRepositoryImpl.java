package com.example.diproject.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello world - from I18nEnglishGreetingService!!";
    }
}
