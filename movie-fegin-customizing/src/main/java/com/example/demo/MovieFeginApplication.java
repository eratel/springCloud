package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//使用 Feign 发送请求
@EnableFeignClients
public class MovieFeginApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieFeginApplication.class, args);
	}
}
