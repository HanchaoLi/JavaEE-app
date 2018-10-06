package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//  also supports default, it is tennisCoach
@Component
//  @Component("theSillyCoach")
public class TennisCoach implements Coach{
	
	//  field di
	@Autowired
	private FortuneService fortuneService;
	//	constructor di
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	public TennisCoach() {
		
	}
	//	setter di
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Tennis Coach workout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
