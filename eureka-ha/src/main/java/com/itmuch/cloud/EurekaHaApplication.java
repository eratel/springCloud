package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//Eureka 的高可用
@SpringBootApplication
@EnableEurekaServer
public class EurekaHaApplication {
  public static void main(String[] args) {
    SpringApplication.run(EurekaHaApplication.class, args);
  }
}
