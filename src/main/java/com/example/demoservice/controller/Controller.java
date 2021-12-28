package com.example.demoservice.controller;

import com.example.demoservice.event.Account;
import com.example.demoservice.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private final UserService userService;

    public Controller(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping(value="/{id}")
//    public List<Account> showEmployees(@PathVariable("id") String id) {
//        List<Account> accounts = userService.getList();
//        return accounts;
//    }
}
