package com.hts.htstask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HtsTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(HtsTaskApplication.class, args);
		System.out.println("Start Task..........");
	}

}
