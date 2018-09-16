package com.warmup;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 min warm up";
	}

	@Override
	public String getFortune() {
		
		//use fortuneService to get a fortune
		
		return fortuneService.getFortune();
	}
}
