package com.billio.api.service;

import com.billio.api.entities.User;
import com.billio.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createRandomUser() {
        User user = new User();
        user.setUsername("User" + new Random().nextInt(1000));
        user.setEmail("email" + new Random().nextInt(1000) + "@example.com");
        // Set other fields if necessary
        return userRepository.save(user);
    }
}

