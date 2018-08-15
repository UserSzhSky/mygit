package com.szh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.szh.util.configClientFeign;

@RestController
public class configClientController {
	@Autowired
	private configClientFeign feign;
//	@Value("${foo}")
//	private String foo;
	@Value("${name}")
	String name;
	@RequestMapping("/pageHi")
	public String getHi() {
		return feign.getHi()+" name"+name;
	}
	@RequestMapping("/PageHello")
	public String getHello() {
		return feign.getHello()+" name"+name;
	}
}
