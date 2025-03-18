package com.example.demo.service.user;

import com.example.demo.bean.UserData;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void addUser(UserData data) {
        UserData newUserData = new UserData();
        BeanUtils.copyProperties(data, newUserData);
        userRepository.save(newUserData);
    }
}
