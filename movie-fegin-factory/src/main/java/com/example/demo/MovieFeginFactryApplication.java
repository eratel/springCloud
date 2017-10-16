package com.example.demo;

import com.example.config.TestConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
/**
 * @params: No such property: code for class: Script1
 * @Author:jikai.sun
 * @Date: Created in 11:13 2017/10/16 0016
 * @Description: //Hystrix factory
 */
@SpringBootApplication
@EnableEurekaClient
//Feign
@EnableFeignClients
//Riben 负载均衡
@RibbonClient(name = "USER", configuration = TestConfig.class)
public class MovieFeginFactryApplication
{

	public static void main(String[] args) {
		SpringApplication.run(MovieFeginFactryApplication.class, args);
	}
}
