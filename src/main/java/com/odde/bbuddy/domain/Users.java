package com.odde.bbuddy.domain;

import com.odde.bbuddy.repository.User;
import com.odde.bbuddy.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class Users {
    private final BCryptPasswordEncoder encoder;
    private final UserRepository repository;

    public Users(BCryptPasswordEncoder encoder, UserRepository repository) {
        this.encoder = encoder;
        this.repository = repository;
    }

    public User add(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return repository.save(user);
    }
}
