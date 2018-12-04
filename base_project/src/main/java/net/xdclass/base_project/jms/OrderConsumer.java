package net.xdclass.base_project.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {
	
	@JmsListener(destination="order.queue")
	public void receiveQueue(String text) {
		System.out.println("order consumer get message: " + text);
	}
}
