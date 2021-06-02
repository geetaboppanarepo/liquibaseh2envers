package com.geeta.h2envers.controllers;

import com.geeta.h2envers.domain.User;
import com.geeta.h2envers.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping(value="/users")
    public User addUser(@RequestBody User user) {

        return userRepository.save(user);
    }

    @GetMapping(value="/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long userId) {
        return ResponseEntity.of(userRepository.findById(userId));
    }
}

