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
 * @Description: hystrix 断路器
 */
@SpringBootApplication
@EnableEurekaClient
//Feign
@EnableFeignClients
//hystrix.stream
@EnableCircuitBreaker
public class MovieFeginApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieFeginApplication.class, args);
	}
}
