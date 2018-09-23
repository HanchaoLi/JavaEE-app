package com.warmup;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("email address");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("constructor");
	}

	//	Setter DI
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setter method      ");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "workout for cricket coach";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
