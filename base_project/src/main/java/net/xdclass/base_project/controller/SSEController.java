package net.xdclass.base_project.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SSEController {

	@RequestMapping(value="api/v1/sse/get_data", produces="text/event-stream;charset=UTF-8")
	public String push() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "data: stock price at " + new Date().getTime()+ "  "+ Math.random() + "\n\n";
	}
}
