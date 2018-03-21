package com.springboot.first.controller;


import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class firstController {
@RequestMapping("/hello")
	public String sayHello()
	{
		return "Hello from spring boot!!!!!";
	}

}
  