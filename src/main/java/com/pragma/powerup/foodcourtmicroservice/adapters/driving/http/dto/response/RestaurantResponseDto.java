package com.pragma.powerup.foodcourtmicroservice.adapters.driving.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RestaurantResponseDto {
    private Long id;
    private Long idOwner;
    private String name;
    private String address;
    private String phone;
    private String nit;
    private String urlLogo;
}
