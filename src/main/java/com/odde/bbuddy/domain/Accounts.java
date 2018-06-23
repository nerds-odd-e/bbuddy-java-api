package com.odde.bbuddy.domain;

import com.odde.bbuddy.repository.AccountRepository;
import com.odde.bbuddy.validator.FieldCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Accounts implements FieldCheck<String> {
    private final AccountRepository accountRepository;

    @Autowired
    public Accounts(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public boolean isValueUnique(String value) {
        return !accountRepository.existsByName(value);
    }
}

