package com.example.MarketPlace.controllers;

import com.example.MarketPlace.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @GetMapping(value="/")
    public void getUsers(){
        Date date = new Date();
        User user = new User("John","443224","john@gmail.com", date,2);
        System.out.println(user.toString());
    }
}
