package com.szh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
//开启断路器功能
@EnableHystrix
public class ServerRibbonApplication {
             
	public static void main(String[] args) {
		SpringApplication.run(ServerRibbonApplication.class, args);
	}
	//RestTemplate 开启负载均衡
    @LoadBalanced
    //向IOC中注入一个实例
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

