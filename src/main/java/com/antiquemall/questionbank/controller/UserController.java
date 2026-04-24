package com.antiquemall.questionbank.controller;

import com.antiquemall.questionbank.common.BaseResponse;
import com.antiquemall.questionbank.common.ResultUtils;
import com.antiquemall.questionbank.dto.UserRegisterRequest;
import com.antiquemall.questionbank.entity.User;
import com.antiquemall.questionbank.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/register")
    public BaseResponse<Boolean> register(@RequestBody UserRegisterRequest request){
        boolean result = userService.register(request.getUsername(), request.getPassword());
        return ResultUtils.success(result);
    }

    @PostMapping("/login")
    public BaseResponse<User> login(@RequestBody UserRegisterRequest request){
        User user = userService.login(request.getUsername(), request.getPassword());
        return ResultUtils.success(user);
    }

}
