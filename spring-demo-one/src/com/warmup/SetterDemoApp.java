package com.warmup;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach thecoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		thecoach.getDailyWorkout();
		thecoach.getFortune();
		
		System.out.println(thecoach.getEmailAddress());
		thecoach.getTeam();
		
		context.close();
	}

}