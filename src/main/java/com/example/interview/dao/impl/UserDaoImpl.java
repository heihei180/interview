package com.example.interview.dao.impl;

import com.example.interview.dao.UserDao;
import com.example.interview.pojo.User;
import org.beetl.sql.core.SQLManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    private SQLManager sqlManager;

    @Override
    public int addUser(User user) {
        return sqlManager.insert(user);
    }

    @Override
    public int updateUser(User user) {
        return sqlManager.updateTemplateById(user);
    }

    @Override
    public int deleteUser(User user) {
        return sqlManager.deleteObject(user);
    }

    @Override
    public User queryUserById(int id) {
        return sqlManager.unique(User.class,id);
    }

    @Override
    public List<User> queryAllUser() {
        return sqlManager.template(null);
    }
}
