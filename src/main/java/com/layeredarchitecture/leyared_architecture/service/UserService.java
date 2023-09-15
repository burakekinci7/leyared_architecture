package com.layeredarchitecture.leyared_architecture.service;

import com.layeredarchitecture.leyared_architecture.dto.User;

public interface UserService {
    User getUserByID(Long userID);
}
