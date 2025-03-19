package com.example.demo.service.user;

import com.example.demo.bean.UserResponse;

import java.util.List;

public interface IUserService {

    /**
     * 加一个对象
     *
     * @param data
     */
    void addUser(UserResponse data);

    /**
     * 查所有的对象
     *
     * @param name
     * @return
     */
    List<UserResponse> queryUser(String name);

    /**
     * 删除一个对象
     *
     * @param name
     */
    void deleteUser(String name);

    /**
     * 删除所有
     */
    void deleteAllUsers();

    /**
     * 修改对象
     */
    void updateUser(UserResponse data);
}
