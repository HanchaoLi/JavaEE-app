package net.xdclass.base_project.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class CommonConsumer {
	@JmsListener(destination="common.queue")
	public void receiveQueue(String text) {
		System.out.println("common consumer get message: " + text);
	}
}
