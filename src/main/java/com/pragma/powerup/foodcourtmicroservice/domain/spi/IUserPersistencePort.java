package com.pragma.powerup.foodcourtmicroservice.domain.spi;

import com.pragma.powerup.foodcourtmicroservice.domain.model.User;

import java.util.List;

public interface IUserPersistencePort {
    void saveUser(User user);
    void deleteUser(User user);
    List<User> getAllProviders(int page);
    User getProvider(Long id);
    User getEmployee(Long id);
    User getClient(Long id);
}