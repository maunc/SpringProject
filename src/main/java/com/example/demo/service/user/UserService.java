package com.example.demo.service.user;

import com.example.demo.bean.UserResponse;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void addUser(UserResponse data) {
        // 这个地方copy 是个todo  大项目会拆分一步对象，最终合成我们接口需要的对象所以有这一步
        UserResponse newUserResponse = new UserResponse();
        BeanUtils.copyProperties(data, newUserResponse);
        userRepository.save(newUserResponse);
    }

    @Override
    public List<UserResponse> queryUser(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public void deleteUser(String name) {
        userRepository.deleteByName(name);
    }

    @Override
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }

    @Override
    public void updateUser(UserResponse data) {
        userRepository.save(data);
    }
}
