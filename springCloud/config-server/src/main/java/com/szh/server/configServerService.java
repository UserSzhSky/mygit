package com.szh.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class configServerService {
	@Value("${server.port}")
	private String port;
	public String getHi() {
		return "Hi use"+port;
	}
	public String getHello() {
		return "Hello use"+port;
	}
}
