package com.mvc.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	//  init HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		
		//  return to specify jsp name
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	//  process HTML form
}
