package com.example.config;

import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Configuration2 {
  @Bean
  public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
    return new BasicAuthRequestInterceptor("user", "123456");
  }

  //在fegin中 去掉 Hyistrix
  @Bean
  @Scope("prototype")
  public Feign.Builder feignBuilder() {
    return Feign.builder();
  }
}
