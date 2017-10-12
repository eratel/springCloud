package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
//Feign
@EnableFeignClients
public class MovieFeginApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieFeginApplication.class, args);
	}
}
