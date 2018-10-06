package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//  read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//  get bean from spring container
		//Coach coach = context.getBean("theSillyCoach", TennisCoach.class);
		
		//get tennis by default id
		Coach coach = context.getBean("tennisCoach", TennisCoach.class);
		
		//  call a method
		coach.getDailyWorkout();
		
		//  close context
		context.close();
	}
}
