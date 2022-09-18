package com.example.diproject.services;


import com.example.diproject.repositories.EnglishGreetingRepository;

//@Profile("english")
//@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }
    @Override
    public String sayGreeting() {
        return englishGreetingRepository.getGreeting();
    }
}
