package com.springdemo;

import org.springframework.stereotype.Component;

//  also supports default, it is tennisCoach
@Component
//  @Component("theSillyCoach")
public class TennisCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Tennis Coach workout";
	}
}
