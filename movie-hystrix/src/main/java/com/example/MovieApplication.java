package com.example;

import com.example.config.ExcludeFromComponentScan;
import com.example.config.TestConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
//user 节点指定使用 TestConfig 方式
@RibbonClient(name = "USER", configuration = TestConfig.class)
//排除掉添加 @ExcludeFromComponentScan 注解
//如果使用 自定义ribben 必须将TestConfig 排除掉
// 不能被SpringBootApplication 扫描到
@ComponentScan(excludeFilters = { @ComponentScan.Filter(type = FilterType.ANNOTATION, value = ExcludeFromComponentScan.class) })
//hystrix.stream
@EnableCircuitBreaker
public class MovieApplication {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(MovieApplication.class, args);
	}
}
