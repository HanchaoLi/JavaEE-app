package net.xdclass.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
}