package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @params: No such property: code for class: Script1
 * @Author:jikai.sun
 * @Date: Created in 23:58 2017/10/16 0016
 * @Description:  Turbine 全局监控 Hystrix
 */
@EnableTurbine
@SpringBootApplication
public class TurbineApplication {
  public static void main(String[] args) {
    SpringApplication.run(TurbineApplication.class, args);
  }
}
