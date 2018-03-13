package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class MovieHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieHystrixApplication.class, args);
	}
}
