package com.example.controller;

import com.example.dao.UserRepository;
import com.example.pojo.User;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 12:32 2017/10/7 0007
 */
@RestController
public class UserController
{
    @Autowired
    private UserRepository userRepository;

    @GetMapping("findone/{id}")
    public User findById(@PathVariable Long id){
        System.out.print(id);
       return userRepository.findOne(id);
    }

    @PostMapping("/user")
    public User postUser(@RequestBody User user){
        return user;
    }

    @GetMapping("/get-user")
    public User getUser(User user){
        return user;
    }

    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/eureka-instance")
    //http://192.168.1.100:9000/
    public String serviceUrl()
    {
        //virtualHostname 就是注册到Eureka 的虚拟名字
        InstanceInfo instance = this.eurekaClient.getNextServerFromEureka("USER", false);
        return instance.getHomePageUrl();
    }

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/instance-info")
    //{"host":"192.168.1.100","port":9000,"metadata":{},"secure":false,"uri":"http://192.168.1.100:9000","serviceId":"user"}
    public ServiceInstance showInfo()
    {
        ServiceInstance localServiceInstance = this.discoveryClient.getLocalServiceInstance();
        return localServiceInstance;
    }

}
