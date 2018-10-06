package com.springdemo;

import org.springframework.stereotype.Component;

/**
 * if there are many services, should use @Qualifier to determine which service you wonna use
 * eg. @Qualifier("happyFortuneService")
 * @author Lee
 *
 */
@Component
public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Happy Fortune Service";
	}

}
