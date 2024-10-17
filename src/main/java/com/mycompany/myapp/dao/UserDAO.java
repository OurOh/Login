package com.mycompany.myapp.dao;

import com.mycompany.myapp.model.User;

public interface UserDAO {
	
    User getUserByUsername(String username);
    
}