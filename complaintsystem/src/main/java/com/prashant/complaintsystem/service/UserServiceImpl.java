package com.prashant.complaintsystem.service;

import com.prashant.complaintsystem.model.User;
import com.prashant.complaintsystem.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User registerUser(User user) {
        user.setRole("USER");
        return repository.save(user);
    }
}