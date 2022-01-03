package com.api;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RolesAllowed({"MASTER"})
	@RequestMapping("/test1")
	public String test1() {
		return "Hello World";
	}
	
	@RolesAllowed({"ADMIN"})
	@RequestMapping("/test2")
	public String test2() {
		return "Hello World";
	}
	
	@RolesAllowed({"USER"})
	@RequestMapping("/test3")
	public String test3() {
		return "Hello World";
	}
}
