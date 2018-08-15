package com.szh.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="config-server",fallback=HystrixImpl.class)
public interface configClientFeign {
	@RequestMapping("/hi")
	public String getHi();
	@RequestMapping("/hello")
	public String getHello();
}
