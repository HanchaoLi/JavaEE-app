package net.xdclass.demo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.xdclass.demo.entity.User;

@RestController
//equals
//@RequestMapping
//@ResponseBody
public class SimpleController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/test")
    public Map<String, String> getMap() {
    	Map<String, String> map = new HashMap<>();
    	map.put("d", "dfd");
    	return map;
    }
    
    
    @GetMapping("/testjson")
    public Object testJson() {
    	
    	return new User(11,"df", "2342342", new Date());
    }
}