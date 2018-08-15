package com.szh.util;

public class HystrixImpl implements configClientFeign{

	@Override
	public String getHi() {
		// TODO Auto-generated method stub
		return "Hi error foo";
	}

	@Override
	public String getHello() {
		// TODO Auto-generated method stub
		return "Hello error foo";
	}

}
