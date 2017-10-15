package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
//Feign
@EnableFeignClients
public class MovieFeginFactryApplication
{

	public static void main(String[] args) {
		SpringApplication.run(MovieFeginFactryApplication.class, args);
	}
}
