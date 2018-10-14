package com.mvc.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	//  init HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		
		//  return to specify jsp name
		return "helloworld-form";
	}
	
	//  process HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
//	public String upperCase(HttpServletRequest request, Model model) {
//		
//		String name  = request.getParameter("studentName");
	public String upperCase(@RequestParam("studentName") String name, Model model) {
		
		
		name = name.toUpperCase();
		
		String result = "yo! " + name;
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
