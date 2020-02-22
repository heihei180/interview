package com.example.interview.dao;

import com.example.interview.pojo.User;

import java.util.List;

public interface UserDao {
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(User user);
    User queryUserById(int id);
    List<User> queryAllUser();
}
