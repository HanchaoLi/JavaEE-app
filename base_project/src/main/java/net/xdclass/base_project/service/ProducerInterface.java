package net.xdclass.base_project.service;

import javax.jms.Destination;

public interface ProducerInterface {

	public void sendMessage(Destination destination, final String message);
	
	public void sendMessage(final String message);
	
	public void publish(String msg);
}
