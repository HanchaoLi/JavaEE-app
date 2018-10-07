package com.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{
	
	private String[] data = {
		"first string",
		"second string",
		"third string"
	};
	private Random random = new Random();
	@Override
	public String getFortune() {
		//  pick a random string from the array
		int index = random.nextInt(data.length);
		return data[index];
	}

}
