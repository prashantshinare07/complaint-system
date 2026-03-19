package com.prashant.complaintsystem.controller;

import com.prashant.complaintsystem.model.User;
import com.prashant.complaintsystem.service.UserService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public User register(@Valid @RequestBody User user) {
        return service.registerUser(user);
    }
}