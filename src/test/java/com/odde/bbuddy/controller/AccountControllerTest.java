package com.odde.bbuddy.controller;

import com.odde.bbuddy.domain.Accounts;
import com.odde.bbuddy.repository.Account;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class AccountControllerTest {
    private Accounts accounts = mock(Accounts.class);
    private AccountController controller = new AccountController(accounts);
    private List<Account> existingAccountList;

    private void givenAccounts(Account... accountList) {
        existingAccountList = Arrays.asList(accountList);
        when(accounts.all()).thenReturn(existingAccountList);
    }

    @Test
    void fetch_all_accounts() {
        givenAccounts(new Account("DBS", 10000));

        List<Account> accountList = controller.index();

        assertThat(accountList).isEqualTo(existingAccountList);
    }

    @Test
    void add_account() {
        Account account = new Account("DBS", 10000);

        controller.add(account);

        verify(accounts).add(account);
    }
}
