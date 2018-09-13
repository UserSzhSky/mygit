package com.szh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class RibbonService {
	@Autowired
	RestTemplate restTemplate;
	//对该方法开启熔断功能，并且指定熔断方法
	@HystrixCommand(fallbackMethod = "hiError")
	public String getHello(String name) {
		//服务接口的请求  返回服务中的内容
		 return restTemplate.getForObject("http://SERVICE-HI/hello?name="+name,String.class);
	}
	@HystrixCommand(fallbackMethod = "hiError")
	public String getHi(String name) {
		//服务接口的请求  返回服务中的内容
		 return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
	}
	public String hiError (String name) {
		return name+" error!!";
	}
}
