package net.xdclass.base_project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication 
@MapperScan("net.xdclass.base_project.mapper")
//@EnableScheduling	//open job schedule
@EnableAsync
public class XdclassApplication  {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(XdclassApplication.class, args);
    }
}