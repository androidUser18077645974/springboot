package com.springboot.bean;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping("test")
	public String  test() {
		System.out.println("Hello Springboot");
		return "Hello Springboot";
	}
	
}
