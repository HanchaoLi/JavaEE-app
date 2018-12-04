package net.xdclass.base_project;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication 
@MapperScan("net.xdclass.base_project.mapper")
//@EnableScheduling	//open job schedule
@EnableAsync
@EnableJms // enable JMS service (ActiveMQ)
public class XdclassApplication  {
	@Bean
	public Queue queue() {
		return new ActiveMQQueue("common.queue");
	}
    public static void main(String[] args) throws Exception {
        SpringApplication.run(XdclassApplication.class, args);
    }
}