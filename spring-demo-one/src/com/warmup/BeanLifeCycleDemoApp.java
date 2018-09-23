package com.warmup;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		Coach thecoach = context.getBean("myCoach", Coach.class);
		
		Coach alphacoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(thecoach.getDailyWorkout());
		
		context.close();
	}

}
