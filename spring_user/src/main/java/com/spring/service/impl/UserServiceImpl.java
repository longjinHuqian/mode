package com.spring.service.impl;

import com.spring.mapper.UserMapper;
import com.spring.pojo.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> findUserAll() {
        return mapper.findUserAll();
    }

    @Override
    public Integer addUser(User user) {
        return mapper.addUser(user);
    }

    @Override
    public Integer modifyUser(User user) {
        return mapper.modifyUser(user);
    }

    @Override
    public Integer deleteUser(Integer id) {
        return mapper.deleteUser(id);
    }
}
