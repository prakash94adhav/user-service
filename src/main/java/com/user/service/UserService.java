package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    //create
    User saveUser(User user);

    //get all users
    List<User> getAllUsers();

    //get single user
    User getUser(String userId);

    //TODO update and delete
}
