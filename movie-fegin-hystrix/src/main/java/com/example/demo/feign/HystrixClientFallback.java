package com.example.demo.feign;

import com.example.demo.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 15:34 2017/10/15 0015
 */
// 如果引用了 必须要对他实例化
@Component
public class HystrixClientFallback implements UserFeignClient
{
    @Override
    public User findById(Long id)
    {
        return new User(1L,null);
    }

    @Override
    public User postUser(User user)
    {
        return new User(1L,null);
    }

    @Override
    public User getUser(User user)
    {
        return new User(1L,null);
    }
}
