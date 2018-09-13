package com.szh.util;

import org.springframework.stereotype.Component;

@Component
public class HystrixImplHello implements FeginInterHello{

	@Override
	public String sayHi(String name) {
		
		return "error";
	}

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "error";
	}

}
