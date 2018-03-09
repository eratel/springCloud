package com.example.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 13:04 2017/10/8 0008
 */
@SpringBootConfiguration
@ExcludeFromComponentScan
public class TestConfig
{
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }

}
