package com.mycompany.myapp.service;

import com.mycompany.myapp.model.User;

public interface UserService {
    User login(String username, String password);
}
