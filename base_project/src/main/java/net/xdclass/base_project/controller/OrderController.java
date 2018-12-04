package net.xdclass.base_project.controller;

import java.util.Date;

import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.xdclass.base_project.domain.JsonData;
import net.xdclass.base_project.domain.User;
import net.xdclass.base_project.service.impl.ProducerServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class OrderController {
	
	@Autowired
	private ProducerServiceImpl producerService;
	
	@GetMapping("order")
	public Object order(String msg){
		
		Destination dest = new ActiveMQQueue("order.queue");
		producerService.sendMessage(dest, msg);
       return JsonData.buildSuccess();
	}
	
	@GetMapping("common")
	public Object common(String msg){
		
		producerService.sendMessage(msg);
       return JsonData.buildSuccess();
	}
}
