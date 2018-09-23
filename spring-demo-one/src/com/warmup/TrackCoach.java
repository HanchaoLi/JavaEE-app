package com.warmup;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	//	Constructor dependency injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "daily workout";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "I got" + fortuneService.getFortune();
	}
	// add init method and destroy method
	public void doMyStartup() {
		System.out.println("track coach init");
	}
	public void doDestroy() {
		System.out.println("track coach destroy");
	}
}
