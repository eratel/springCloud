package com.example.demo.controller;

import com.example.demo.feign.FeignClient2;
import com.example.demo.feign.UserFeignClient;
import com.example.demo.pojo.User;
import org.apache.log4j.Logger;
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
    Logger logger = Logger.getLogger(MovieController.class);

    @Autowired
    UserFeignClient userFeignClient;

    @GetMapping("movie/{id}")
    public User findById(@PathVariable Long id)
    {
        logger.info("--------------------------->test");
        User byId = userFeignClient.findById(id);
        return byId;
    }

    @Autowired
    private FeignClient2 feignClient2;

    @GetMapping("/{serviceName}")
    public String findServiceInfoFromEurekaByServiceName(@PathVariable String serviceName) {
        return this.feignClient2.findServiceInfoFromEurekaByServiceName(serviceName);
    }

}
