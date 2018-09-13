package com.szh.util;

import org.springframework.stereotype.Component;

@Component
public class HystrixImpl implements FeginInter {

	@Override
	public String sayHi(String name) {
		// TODO Auto-generated method stub
		return "Hi"+ name + " error";
	}

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello"+ name + " error";
	}

}
