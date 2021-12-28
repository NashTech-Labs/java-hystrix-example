package com.example.demoservice.service;

import com.example.demoservice.event.Account;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<Account> getList() {
        Account account = new Account("1","1", "1");
        List<Account> accounts = new ArrayList<>();
        accounts.add(account);
        return accounts;
    }

}
