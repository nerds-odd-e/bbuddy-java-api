package com.odde.bbuddy.controller;

import com.odde.bbuddy.repository.Account;
import com.odde.bbuddy.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    private final AccountRepository repository;

    @Autowired
    public AccountController(AccountRepository repository){

        this.repository = repository;
    }
    @GetMapping
    public List<Account> index(){
        return repository.findAll();
    }

    @PostMapping
    public Account add(@Valid @RequestBody Account account){
        return repository.save(account);
    }
}
