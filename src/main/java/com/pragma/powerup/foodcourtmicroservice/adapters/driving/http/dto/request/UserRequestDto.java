package com.pragma.powerup.foodcourtmicroservice.adapters.driving.http.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserRequestDto {
    private Long idPerson;
    private Long idRole;
}
