package com.odde.bbuddy.domain;

import com.odde.bbuddy.repository.User;
import com.odde.bbuddy.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UsersTest {
    @Test
    void encrypt_password_when_sign_up(){
        BCryptPasswordEncoder encoder = mock(BCryptPasswordEncoder.class);
        when(encoder.encode("PASSWORD")).thenReturn("ENCRYPTED");
        UserRepository repository = mock(UserRepository.class);
        Users users = new Users(encoder, repository);

        users.add(new User("EMAIL", "PASSWORD"));

        verify(repository).save(argThat(user -> user.getPassword().equals("ENCRYPTED")));
    }
}
