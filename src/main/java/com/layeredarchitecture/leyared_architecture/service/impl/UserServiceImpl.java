package com.layeredarchitecture.leyared_architecture.service.impl;

import com.layeredarchitecture.leyared_architecture.dto.User;
import com.layeredarchitecture.leyared_architecture.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    //Impl -> implementation
    @Override
    public User getUserByID(Long userID) {
        return null;
    }

    //service annotation -> new UserServiceImpl();
}
