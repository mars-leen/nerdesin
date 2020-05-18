package com.springboot23.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


	@GetMapping("/demo")
	public String demo() throws InterruptedException {
	    // 模拟业务耗时处理流程
		Thread.sleep(20 * 1000L);
		return "hello";
	}
}
