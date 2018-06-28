package com.odde.bbuddy.domain;

import com.odde.bbuddy.repository.Account;
import com.odde.bbuddy.repository.AccountRepository;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class AccountsTest {
    AccountRepository repository = mock(AccountRepository.class);
    Accounts accounts = new Accounts(repository);
    private List<Account> existingAccountList;

    private void givenAccounts(Account... accountList) {
        existingAccountList = Arrays.asList(accountList);
        when(accounts.all()).thenReturn(existingAccountList);
    }

    @Test
    void name_should_be_unique() {
        when(repository.existsByName("DUPLICATED")).thenReturn(true);

        boolean unique = accounts.isValueUnique("DUPLICATED");

        assertThat(unique).isEqualTo(false);
    }

    @Test
    void add_account() {
        Account account = new Account("DBS", 10000);

        accounts.add(account);

        verify(repository).save(account);
    }

    @Test
    void get_all_accounts() {
        givenAccounts(new Account("DBS", 10000));

        List<Account> accountList = accounts.all();

        assertThat(accountList).isEqualTo(existingAccountList);
    }
}
