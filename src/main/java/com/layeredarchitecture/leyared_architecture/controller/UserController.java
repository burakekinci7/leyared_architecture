package com.layeredarchitecture.leyared_architecture.controller;

import com.layeredarchitecture.leyared_architecture.dto.User;
import com.layeredarchitecture.leyared_architecture.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    @Autowired
    private UserService userService;

    //get user id
    @GetMapping(path = "/users/{userID}")
    public User getUserById(@PathVariable("userID") Long userID) {
        return userService.getUserByID(userID);
    }
}
