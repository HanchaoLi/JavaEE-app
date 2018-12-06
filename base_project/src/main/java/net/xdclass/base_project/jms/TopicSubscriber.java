package net.xdclass.base_project.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TopicSubscriber {
	
	@JmsListener(destination="video.topic")
	public void receive1(String text) {
		System.out.println("topic consumer1: " + text);
	}
	
	@JmsListener(destination="video.topic")
	public void receive2(String text) {
		System.out.println("topic consumer2: " + text);
	}
	
	@JmsListener(destination="video.topic")
	public void receive3(String text) {
		System.out.println("topic consumer3: " + text);
	}
}
