package com.good.smf.service.impl;

import com.good.smf.dao.UserDao;
import com.good.smf.pojo.User;
import com.good.smf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryAllUsers() {
        List<User> users = userDao.queryAllUser();
        return users;
    }
}
