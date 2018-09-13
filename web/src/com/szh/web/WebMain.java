package com.szh.web;

import javax.xml.ws.Endpoint;

import com.szh.web.impl.HelloWorlds;
public class WebMain {
	public static void main(String[] args) {
		Helloworld face = new HelloWorlds();
		Endpoint.publish("172.20.10.3/vashon", face);
		System.out.println("Web Service暴露成功！！");
	}
}
