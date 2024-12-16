package com.example.demo.controller;

import com.example.demo.bean.UserData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/testJson")
public class TestJsonController {

    @RequestMapping("/user")
    public UserData getUser() {
        return new UserData(1, "谢广坤", 10, "邯郸");
    }

    @RequestMapping("/userList")
    public List<UserData> getUserList() {
        List<UserData> list = new ArrayList<>();
        list.add(new UserData(1,"马龙",32,"鞍山"));
        list.add(new UserData(2,"柯南",12,"日本"));
        return list;
    }

    @RequestMapping("/userMap")
    public Map<String,UserData> getUserMap() {
        Map<String,UserData> map = new HashMap<>();
        map.put("中国人",new UserData(1,"马龙",32,"鞍山"));
        map.put("日本人",new UserData(2,"柯南",12,"日本"));
        return map;
    }
}
