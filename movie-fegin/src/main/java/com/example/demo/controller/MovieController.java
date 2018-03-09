package com.example.demo.controller;

import com.example.demo.feign.UserFeignClient;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 12:47 2017/10/7 0007
 */
@RestController
public class MovieController
{
    @Autowired
    UserFeignClient userFeignClient;

    @GetMapping("movie/{id}")
    public User findById(@PathVariable Long id)
    {
        User byId = userFeignClient.findById(id);
        return byId;
    }

    @GetMapping("user")
    public User postUser(User user)
    {
        User byId = userFeignClient.postUser(user);
        return byId;
    }

    @GetMapping("get-user")
    public User getUser(User user)
    {
        User byId = userFeignClient.getUser(user);
        return byId;
    }
}
