package com.example.demo.feign;

import com.example.demo.pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//fallbackFactory 指定一个Hystrix 工厂
@FeignClient(name = "USER", fallbackFactory = HystrixClientFactory.class)
public interface UserFeignClient {
  @RequestMapping(value = "/findone/{id}", method = RequestMethod.GET)
  public User findById(@PathVariable("id") Long id);
}
