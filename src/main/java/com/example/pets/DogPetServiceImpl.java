package com.example.pets;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class DogPetServiceImpl implements PetService {
    @Override
    public String getPetType() {
        return "i'm the best";
    }
}
