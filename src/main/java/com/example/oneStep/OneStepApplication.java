package com.example.oneStep;

import java.util.Date;
import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneStepApplication {
	
	
	
	// here we can change the time zone eassilly
//	@PostConstruct
//    public void init(){
//        TimeZone.setDefault(TimeZone.getTimeZone("IST"));   // It will set UTC timezone
//        System.out.println("Spring boot application running in IST timezone :"+new Date());   // It will print UTC timezone
//    }

	public static void main(String[] args) {
		SpringApplication.run(OneStepApplication.class, args);
	}

}
