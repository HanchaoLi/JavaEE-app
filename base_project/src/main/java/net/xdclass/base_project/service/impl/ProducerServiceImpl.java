package net.xdclass.base_project.service.impl;

import javax.jms.Destination;
import javax.jms.Queue;
import javax.jms.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import net.xdclass.base_project.service.ProducerInterface;

@Service
public class ProducerServiceImpl implements ProducerInterface{
	
	@Autowired
	private JmsMessagingTemplate jmsTemplate;
	
	@Autowired
	private Queue queue;
	
	@Autowired
	private Topic topic;
	
	@Override
	public void sendMessage(Destination destination, final String message) {
		jmsTemplate.convertAndSend(destination, message);
		
	}

	@Override
	public void sendMessage(final String message) {
		//this.queue is registered in application class, it is common.queue
		jmsTemplate.convertAndSend(this.queue, message);
	}

	@Override
	public void publish(String msg) {
		this.jmsTemplate.convertAndSend(this.topic, msg);
		
	}

}
