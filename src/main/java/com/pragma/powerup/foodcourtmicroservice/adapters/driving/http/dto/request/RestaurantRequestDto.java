package com.pragma.powerup.foodcourtmicroservice.adapters.driving.http.dto.request;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RestaurantRequestDto {
    @NotBlank(message = "El id del propietario no puede ser nulo o vacio")
    @Digits(integer = 15, fraction = 0 , message = "El numero de documento debe contener valores numericos")
    @Size(min = 6, max = 11)
    private Long idOwner;
    @NotBlank(message = "El nombre no puede ser nulo o vacio")
    private String name;
    private String address;
    private String phone;
    private String nit;
    private String password;
}
