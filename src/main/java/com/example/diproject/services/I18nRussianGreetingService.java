package com.example.diproject.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile({"russian","default"})
//@Service("i18nService")
public class I18nRussianGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Привет мир - из I18nRussianGreetingService !!";
    }
}
