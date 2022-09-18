package com.example.diproject.config;

import com.example.diproject.repositories.EnglishGreetingRepository;
import com.example.diproject.repositories.EnglishGreetingRepositoryImpl;
import com.example.diproject.services.*;
import com.example.pets.DogPetServiceImpl;
import com.example.pets.PetService;
import com.example.pets.PetServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    @Primary
    PrimaryGreetingServiceImpl primaryGreetingService() {
        return new PrimaryGreetingServiceImpl();
    }

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

    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Bean
    @Profile("english")
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Bean("i18nService")
    @Profile("russian")
    I18nRussianGreetingService i18nRussianGreetingService() {
        return new I18nRussianGreetingService();
    }
    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }
}
