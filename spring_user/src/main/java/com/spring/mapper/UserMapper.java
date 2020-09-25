package com.spring.mapper;

import com.spring.pojo.User;

import java.util.List;

public interface UserMapper {
    //查询说有用户信息
    List<User> findUserAll();
    //添加用户信息
    Integer addUser(User user);
    //修改用户信息
    Integer modifyUser(User user);
    //删除用户
    Integer deleteUser(Integer id);
}
