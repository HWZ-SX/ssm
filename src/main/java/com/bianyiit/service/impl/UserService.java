package com.bianyiit.service.impl;

import com.bianyiit.dao.IUserDao;
import com.bianyiit.domain.User;
import com.bianyiit.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
