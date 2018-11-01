package net.xdclass.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//equals
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan
public class XdclassApplication {

	public static void main(String[] args) throws Exception{
    	SpringApplication.run(XdclassApplication.class, args);
    }
}
