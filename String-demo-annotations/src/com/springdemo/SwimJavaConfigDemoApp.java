package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//  read spring config class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//  get bean from spring container
		//Coach coach = context.getBean("theSillyCoach", TennisCoach.class);
		
		//get tennis by default id
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		
		//  call a method
		coach.getDailyWorkout();
		
		//  get daily fortune
		coach.getDailyFortune();
		
		coach.getEmail();
		
		coach.getTeam();
		
		//  close context
		context.close();
	}
}
