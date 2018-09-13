package com.szh.util;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/*
 * 通过@ FeignClient（“服务名”），来指定调用哪个服务
 * */
@FeignClient(value = "service-hi",fallback = HystrixImpl.class)
public interface FeginInter {
	//识别服务中的那个请求(向服务器发送请求)
	@RequestMapping(value="/hi")
	public String sayHi(@RequestParam(value="name") String name);
	@RequestMapping(value="/hello")
	public String sayHello(@RequestParam(value="name") String name);//value 属性必须带着
}
