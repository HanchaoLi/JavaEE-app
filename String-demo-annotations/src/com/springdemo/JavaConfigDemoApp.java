package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//  read spring config class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//  get bean from spring container
		//Coach coach = context.getBean("theSillyCoach", TennisCoach.class);
		
		//get tennis by default id
		Coach coach = context.getBean("tennisCoach", TennisCoach.class);
		
		//  call a method
		coach.getDailyWorkout();
		
		//  get daily fortune
		coach.getDailyFortune();
		
		//  close context
		context.close();
	}
}
