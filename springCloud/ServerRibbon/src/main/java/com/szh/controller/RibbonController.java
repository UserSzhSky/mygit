package com.szh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.szh.service.RibbonService;

@RestController
public class RibbonController {
    @Autowired
    RibbonService service;
    @RequestMapping("/hello")
    public String helloController(@RequestParam String name) {
        //return restTemplate.getForEntity("http://SERVICE-HI/hi", String.class).getBody();
    	return service.getHello(name);
    }
    @RequestMapping("/hi")
    public String hiController(@RequestParam String name) {
        //return restTemplate.getForEntity("http://SERVICE-HI/hi", String.class).getBody();
    	return service.getHi(name);
    }
}