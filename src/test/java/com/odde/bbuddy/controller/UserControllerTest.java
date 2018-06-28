package com.odde.bbuddy.controller;

import com.odde.bbuddy.domain.Users;
import com.odde.bbuddy.repository.User;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UserControllerTest {
    @Test
    void add_user(){
        Users users = mock(Users.class);
        UserController controller = new UserController(users);

        User user = new User("EMAIL", "PASSWORD");
        controller.signUp(user);

        verify(users).add(user);
    }
}
