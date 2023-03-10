package com.axis.crud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.crud.service.EmpService;


@RestController
@RefreshScope
//@Profile("development")
public class EmpController {
	
	@Autowired
	EmpService empservice;
	
	@RequestMapping("/helloEmp3")
	public String sayHello3() {
		return empservice.getService();
		}
	
	
	@Value("${text.greeting}")
	private String msg;
	
	@Value("${name}")
	private String nameMsg;
	
	@GetMapping("/helloEmp")
	public String sayHello() {
		return "hi " + msg;
	}
	

	@GetMapping("/helloEmp2")
	public String sayHello2() {
		return "hi " + nameMsg;
	}
	
	
	
	
	

}