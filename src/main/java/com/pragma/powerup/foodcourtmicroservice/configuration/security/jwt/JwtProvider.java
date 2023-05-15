package com.pragma.powerup.foodcourtmicroservice.configuration.security.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class JwtProvider {

    private static final String URL_USER_MICROSERVICE = "http://localhost:8090";
    private static final String URL_USER_MICROSERVICE_VALIDATE_TOKEN = "/auth/token-is-valid/";
    @Value("${jwt.secret}")
    private String secret;
    private final WebClient webClient;

    public JwtProvider() {
        this.webClient = WebClient.create(URL_USER_MICROSERVICE);
    }

    public Boolean tokenIsValid(String token) {
        return webClient.get()
                .uri(URL_USER_MICROSERVICE_VALIDATE_TOKEN + token)
                .retrieve()
                .bodyToMono(Boolean.class)
                .block();
    }

    public Claims parseJwtToken(String token) {
        return Jwts.parser().setSigningKey(secret.getBytes()).parseClaimsJws(token).getBody();
    }
}
