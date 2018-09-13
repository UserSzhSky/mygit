package com.szh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.szh.server.configServerService;

@RestController
public class configServerController {
	@Autowired
	private configServerService service;
	
	@RequestMapping("/hi")
	public String getHi() {
		return service.getHi();
	}
	@RequestMapping("/hello")
	public String getHello() {
		return service.getHello();
	}
}
