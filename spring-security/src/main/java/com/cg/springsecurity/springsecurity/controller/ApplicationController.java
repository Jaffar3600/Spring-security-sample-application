package com.cg.springsecurity.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/home")
@RestController
public class ApplicationController {
	 @GetMapping("/hello")
	public String hello() {
		return "hai jaffar";
	}
}
