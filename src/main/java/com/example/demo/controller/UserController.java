package com.example.demo.controller;

import com.example.demo.bean.BaseResponse;
import com.example.demo.bean.UserData;
import com.example.demo.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 接口方法支持返回对象 并返回Json文本
@RequestMapping("/user") //类级别映射  就是接口加一个  /user/xxx
public class UserController {

    @Autowired
    IUserService userService;


    //增加
    @PostMapping(value = "/add")
    public BaseResponse<UserData> addUser(@Validated @RequestBody UserData data) {
        userService.addUser(data);
        return BaseResponse.success(data);
    }

    //查询
    //@GetMapping

    //修改
    //@PutMapping

    //删除
    //@DeleteMapping
}
