package net.xdclass.base_project.service.impl;

import javax.jms.Destination;
import javax.jms.Queue;

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
	
	@Override
	public void sendMessage(Destination destination, final String message) {
		jmsTemplate.convertAndSend(destination, message);
		
	}

	@Override
	public void sendMessage(final String message) {
		jmsTemplate.convertAndSend(this.queue, message);
	}

}
