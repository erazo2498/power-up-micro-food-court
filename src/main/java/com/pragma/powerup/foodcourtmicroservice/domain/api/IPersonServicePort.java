package com.pragma.powerup.foodcourtmicroservice.domain.api;

import com.pragma.powerup.foodcourtmicroservice.domain.model.Person;

public interface IPersonServicePort {
    void savePerson(Person person);
}
