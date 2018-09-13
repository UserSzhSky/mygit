package com.szh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.szh.service.ClientService;

@RestController
public class ClientController {
	@Autowired
	ClientService service;
	@RequestMapping(value="/hi")
	public String clientHi(@RequestParam String name) {
		return service.informationHi(name);
	}
	@RequestMapping(value="/hello")
	public String clientHello(@RequestParam String name) {
		return service.informationHello(name);
	}
}
