package com.example.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 11:09 2017/10/16 0016
 */
@SpringBootConfiguration
public class TestConfig
{
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }

}
