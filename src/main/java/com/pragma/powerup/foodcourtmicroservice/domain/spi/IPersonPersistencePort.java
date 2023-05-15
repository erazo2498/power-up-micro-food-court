package com.pragma.powerup.foodcourtmicroservice.domain.spi;

import com.pragma.powerup.foodcourtmicroservice.domain.model.Person;

public interface IPersonPersistencePort {
    void savePerson(Person person);
}
