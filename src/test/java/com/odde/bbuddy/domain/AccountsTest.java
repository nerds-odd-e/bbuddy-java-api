package com.odde.bbuddy.domain;

import com.odde.bbuddy.repository.AccountRepository;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AccountsTest {
    @Test
    void name_should_be_unique(){
        AccountRepository repository = mock(AccountRepository.class);
        when(repository.existsByName("DUPLICATED")).thenReturn(true);
        Accounts accounts = new Accounts(repository);

        boolean unique = accounts.isValueUnique("DUPLICATED");

        assertThat(unique).isEqualTo(false);
    }
}
