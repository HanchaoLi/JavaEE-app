package com.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//  also supports default, it is tennisCoach
@Component
//  @Component("theSillyCoach")
//  @Scope("prototype") will create new instance everytime

public class TennisCoach implements Coach{
//	@Component
//	public class TennisCoach implements Coach {
//
//	    private FortuneService fortuneService;
//
//	    // define a default constructor
//	    public TennisCoach() {
//	        System.out.println(">> TennisCoach: inside default constructor");
//	    }
//	    // using qualifier in constructor
//	    @Autowired
//	    public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
//
//	        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");
//	        
//	        fortuneService = theFortuneService;
//	    }
//	        
//	    
//	    /*
//	    @Autowired
//	    public void doSomeCrazyStuff(FortuneService theFortuneService) {
//	        System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
//	        fortuneService = theFortuneService;
//	    }
	//  field di
	@Autowired
	@Qualifier("randomFortuneService")
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
	//  do this after constructor run
	@PostConstruct
	public void doStartStuff() {
		System.out.println("do start");
	}
	//  do this before instance destroy, but when prototype, spring does not call predestroy
	@PreDestroy
	public void doCleanupStuff() {
		System.out.println("do clean");
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
