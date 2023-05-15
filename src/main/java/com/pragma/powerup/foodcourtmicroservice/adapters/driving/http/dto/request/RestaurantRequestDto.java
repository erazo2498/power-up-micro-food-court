package com.pragma.powerup.foodcourtmicroservice.adapters.driving.http.dto.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RestaurantRequestDto {
    @NotNull(message = "El id del propietario no puede ser nulo o vacio")
    @Digits(integer = 15, fraction = 0 , message = "El numero de documento debe contener valores numericos")
    private Long idOwner;
    @NotBlank(message = "El nombre no puede ser nulo o vacio")
    private String name;
    private String address;
    @Pattern(regexp = "^(\\d{10,11})|(\\+\\d{12,13})$", message = "el numero de celular debe contener un máximo de 13 caracteres y puede contener el símbolo +")
    private String phone;
    private String nit;
    private String urlLogo;
}
