package com.example.controller;

import com.example.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 12:47 2017/10/7 0007
 */
@RestController
public class MovieController
{
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("movie/{id}")
    @HystrixCommand(fallbackMethod = "findByIdFallback")
    public User findById(@PathVariable Long id){
        return this.restTemplate.getForObject("http://USER/findone/"+id,User.class);
    }

    public User findByIdFallback(Long id) {
        User user = new User();
        user.setId(0L);
        return user;
    }
}
