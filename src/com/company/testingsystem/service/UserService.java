package com.company.testingsystem.service;

import com.company.testingsystem.db.Database;
import com.company.testingsystem.models.User;

import java.util.Set;

public class UserService {

    public User login(String username, String password) {
        // todo checking params

        Set<User> users = Database.solveMap.keySet();
        for (User user : users) {
            if (user.getUsername().equals(username) &&
            user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
}
