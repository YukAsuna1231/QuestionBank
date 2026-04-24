package com.antiquemall.questionbank.service.impl;

import com.antiquemall.questionbank.entity.User;
import com.antiquemall.questionbank.mapper.UserMapper;
import com.antiquemall.questionbank.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public boolean register(String username, String password) {
        if (username == null || username.trim().isEmpty()){
            throw new RuntimeException("用户名不能为空");
        }
        if (password == null || password.length() < 6){
            throw new RuntimeException("密码长度不能小于6");
        }

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        User user = userMapper.selectOne(queryWrapper);
        Long count = userMapper.selectCount(queryWrapper);
        if (count > 0){
            throw new RuntimeException("用户名已存在");
        }

        user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setRole("user");

        return userMapper.insert(user) > 0;
    }

    @Override
    public User login(String username, String password) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        queryWrapper.eq("password", password);

        User user = userMapper.selectOne(queryWrapper);
        if (user == null){
            throw new RuntimeException("用户名或密码错误");
        }
        return user;
    }
}
