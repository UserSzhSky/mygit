package com.szh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.szh.util.FeginInter;
import com.szh.util.FeginInterHello;

@RestController
public class FeginController {
	@Autowired
	FeginInter fegin;
//	@Autowired
//	FeginInterHello feginHello;
	//来自页面的请求
	@RequestMapping("/hi")
	public String feginHi(@RequestParam(value="name") String name){
		return fegin.sayHi(name);//+feginHello.sayHi(name);
	}
	//来自页面的请求
	@RequestMapping("/hello")
	public String feginHello(@RequestParam(value="name") String name){
		return fegin.sayHello(name);//+feginHello.sayHello(name);
	}
}
