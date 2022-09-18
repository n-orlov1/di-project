package com.example.diproject.config;

import com.example.diproject.services.ConstructorGreetingsServiceImpl;
import com.example.diproject.services.PropertyGreetingServiceImpl;
import com.example.diproject.services.SetterGreetingsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingsServiceImpl constructorGreetingsService() {
        return new ConstructorGreetingsServiceImpl();
    }

    @Bean
    PropertyGreetingServiceImpl propertyGreetingService() {
        return new PropertyGreetingServiceImpl();
    }

    @Bean
    SetterGreetingsServiceImpl setterGreetingsService() {
        return new SetterGreetingsServiceImpl();
    }
}
