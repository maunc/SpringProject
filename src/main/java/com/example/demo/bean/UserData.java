package com.example.demo.bean;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Table(name = "table_user")
@Entity
public class UserData {

    @Id //主键Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主键自增
    @Column(name = "user_id")
    private int id;
    @NotBlank(message = "用户名不能为空") //去掉空格
    @Column(name = "user_name")
    private String name;
    @Column(name = "user_age")
    private int age;
    @Column(name = "user_address")
    private String address;

    public UserData() {
    }

    public UserData(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
