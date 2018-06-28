package com.odde.bbuddy.controller;

import com.odde.bbuddy.domain.Accounts;
import com.odde.bbuddy.repository.Account;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    private final Accounts accounts;

    public AccountController(Accounts accounts) {
        this.accounts = accounts;
    }

    @GetMapping
    public List<Account> index(){
        return accounts.all();
    }

    @PostMapping
    public Account add(@Valid @RequestBody Account account){
        return accounts.add(account);
    }
}
