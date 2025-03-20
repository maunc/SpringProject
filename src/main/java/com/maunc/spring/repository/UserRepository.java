package com.maunc.spring.repository;

import com.maunc.spring.bean.UserResponse;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 一定要注意自定义的时候，名称一定要对的上，不然就是会报错
 */

//注解将接口标记为 Spring Bean，然后继承 CrudRepository 泛型接口，并指定实体类和主键类型。
@Repository
public interface UserRepository extends CrudRepository<UserResponse, Integer> {


    List<UserResponse> findByName(String name);

    @Modifying
    @Transactional
    void deleteByName(String name);
}
