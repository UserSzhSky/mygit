package com.szh.web.impl;

import java.util.Date;

import javax.jws.WebService;

import com.szh.web.Helloworld;
//指定webServvice 实现的接口以及服务器名称
@WebService(endpointInterface="com.szh.web.Helloworld",serviceName = "HelloWorldWs")
public class HelloWorlds implements Helloworld{

	@Override
	public String sayHi(String name) {
		return name+"你好！现在时间："+new Date();
	}
	
}
