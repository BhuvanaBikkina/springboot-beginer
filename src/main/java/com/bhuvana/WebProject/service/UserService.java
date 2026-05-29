package com.bhuvana.WebProject.service;

import java.util.ArrayList;
import java.util.List;

import com.bhuvana.WebProject.model.User;

public class UserService {
    private List<User> allUsers;

    public UserService() {
        allUsers = new ArrayList<>(); // Empty Array List

        allUsers.add(new User("Srinivas", "Male", "/johndoe.png", 1));
        allUsers.add(new User("Bhuvana", "Female", "/janedoe.png", 2));
    }

    // Name is of our choice
    public List<User> getAllUsers() {
        return allUsers;
    }
}
