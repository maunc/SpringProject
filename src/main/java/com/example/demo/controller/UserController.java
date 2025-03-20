package com.example.demo.controller;

import com.example.demo.base.BaseResponse;
import com.example.demo.bean.UserResponse;
import com.example.demo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // 接口方法支持返回对象 并返回Json文本
@RequestMapping("/user") //类级别映射  就是接口加一个  /user/xxx
public class UserController {

    @Autowired
    UserService userService;

    //增加
    @PostMapping(value = "/add")
    public BaseResponse<String> addUser(@Validated @RequestBody UserResponse data) {
        userService.addUser(data);
        return BaseResponse.success("add " + data.getName() + " success");
    }

    @GetMapping(value = "/queryAll")
    public BaseResponse<List<UserResponse>> queryAllUser() {
        return BaseResponse.success(userService.queryUserAll());
    }

    //查询
    @GetMapping(value = "/queryByName")
    public BaseResponse<List<UserResponse>> getUser(@RequestParam(value = "userName") String name) {
        return BaseResponse.success(userService.queryUserByName(name));
    }

    //修改  对象的Body一个值也不能错   更改那个就修改Body的那个字段
    @PutMapping(value = "/updateByUser")
    public BaseResponse<String> updateUser(@Validated @RequestBody UserResponse data) {
        userService.updateUser(data);
        return BaseResponse.success("update user success");
    }

    //删除
    @DeleteMapping(value = "/deleteByName/{userName}")
    public BaseResponse<String> deleteUser(@PathVariable String userName) {
        userService.deleteUser(userName);
        return BaseResponse.success("delete " + userName + " success");
    }

    //删除所有
    @DeleteMapping(value = "/deleteAll")
    public BaseResponse<String> deleteAllUsers() {
        userService.deleteAllUsers();
        return BaseResponse.success("deleteAll success");
    }

}
