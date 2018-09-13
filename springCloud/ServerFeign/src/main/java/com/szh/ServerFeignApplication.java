package com.szh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//表明是一个Eureka Client
@EnableEurekaClient
//向服务中心注册
@EnableDiscoveryClient
//开启Feign功能
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrixDashboard
public class ServerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerFeignApplication.class, args);
	}
}
