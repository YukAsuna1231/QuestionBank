package com.antiquemall.questionbank.service;

import com.antiquemall.questionbank.entity.User;

public interface UserService {
    boolean register(String username, String password);
    User login(String username, String password);
}
