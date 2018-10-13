package com.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// if not comment component scan and use property source, will cause error
//@ComponentScan("com.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	
	
	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneSerivce() {
		return new SadFortuneService();
	}
	
	// defina bean for our swim coach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneSerivce());
	}
}
