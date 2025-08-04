package com.cognizant.account.controller;

import com.cognizant.account.model.AccountModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/accounts/{number}")
    public AccountModel showAccount(@PathVariable("number") String accountNumber){
        return new AccountModel(accountNumber, "savings", 234343);
    }
}