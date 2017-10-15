package com.example.demo.feign;

import com.example.config.Configuration2;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//没有使用Fegin  用于对Client 单独使用 Fegin的测试
//使用就要加 fallback
@FeignClient(name = "xxxx", url = "http://localhost:8761/", configuration = Configuration2.class)
public interface FeignClient2
{
    //访问apps 需要添加 账号和密码  需要读取 Configuration2
    @RequestMapping(value = "/eureka/apps/{serviceName}")
    public String findServiceInfoFromEurekaByServiceName(@PathVariable("serviceName") String serviceName);

}
