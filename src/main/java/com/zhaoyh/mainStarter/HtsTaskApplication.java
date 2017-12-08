package com.zhaoyh.mainStarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HtsTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(HtsTaskApplication.class, args);
		System.out.println("Start Task..........");
	}

}
