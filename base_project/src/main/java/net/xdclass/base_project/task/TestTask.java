package net.xdclass.base_project.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestTask {
	
	@Scheduled(fixedRate=2000) // cron, a linux expression (cron="*/1 * * * * *") run every second
	public void sum() {
		System.out.println(234);
	}
}
