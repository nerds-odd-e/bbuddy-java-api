package com.odde.bbuddy.controller;

import com.odde.bbuddy.domain.Users;
import com.odde.bbuddy.repository.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final Users users;

    public UserController(Users users) {
        this.users = users;
    }

    @PostMapping("/signup")
    public void signUp(@RequestBody User user) {
        users.add(user);
    }
}
