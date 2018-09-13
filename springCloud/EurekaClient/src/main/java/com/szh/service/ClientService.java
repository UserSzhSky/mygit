package com.szh.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
	@Value("${server.port}")
	private String port;
	public String informationHi(String name) {
		return "Hi "+name +" using port:"+port; 
	}
	
	public String informationHello(String name) {
		return "Hello "+ name +" using port:"+port; 
	}
}
