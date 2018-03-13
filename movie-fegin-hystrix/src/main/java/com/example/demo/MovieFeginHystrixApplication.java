package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @params: No such property: code for class: Script1
 * @Author:jikai.sun
 * @Date: Created in 23:53 2017/10/15 0015
 * @Description: hystrix 断路器   某个节点单独使用短路器  看Configuration2
 * Configuration2  去除了对hystrix的支持
 */
@SpringBootApplication
@EnableEurekaClient
//Feign
@EnableFeignClients
//hystrix
// UserFeignClient 实现了对hystrixDashBoard的支持
@EnableCircuitBreaker
public class MovieFeginHystrixApplication
{

	public static void main(String[] args) {
		SpringApplication.run(MovieFeginHystrixApplication.class, args);
	}
}
