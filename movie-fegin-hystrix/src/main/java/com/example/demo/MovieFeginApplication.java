package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
//Feign
@EnableFeignClients
//hystrix 断路器  让你user 关闭后  他会走 HystrixClientFallback
public class MovieFeginApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieFeginApplication.class, args);
	}
}
