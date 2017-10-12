package com.example.demo.feign;

import com.example.demo.pojo.User;
import config.Configuration1;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

//使用Feign 默认写法  Configuration1配置为Feign默认
@FeignClient(name = "USER", configuration = Configuration1.class)
public interface UserFeignClient
{
    @RequestLine("GET /findone/{id}")
    public User findById(@Param("id") Long id);
}
