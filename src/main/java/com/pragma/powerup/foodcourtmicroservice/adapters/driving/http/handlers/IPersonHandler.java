package com.pragma.powerup.foodcourtmicroservice.adapters.driving.http.handlers;

import com.pragma.powerup.foodcourtmicroservice.adapters.driving.http.dto.request.PersonRequestDto;

public interface IPersonHandler {
    void savePerson(PersonRequestDto personRequestDto);
}
