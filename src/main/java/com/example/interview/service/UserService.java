package com.example.interview.service;

import com.example.interview.pojo.User;

import java.util.List;

public interface UserService {
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(User user);
    User queryUserById(int id);
    List<User> queryAllUser();
}
