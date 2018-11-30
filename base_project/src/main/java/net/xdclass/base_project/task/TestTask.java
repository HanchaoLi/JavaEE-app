package net.xdclass.base_project.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestTask {
	
	@Scheduled(fixedRate=2000)
	public void sum() {
		System.out.println(234);
	}
}
