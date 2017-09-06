package com.zhaoyh.mainStarter;

import com.zhaoyh.utils.TestBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "com.zhaoyh.utils")
public class HtsTaskApplication {

	/**
	 * 显示生成类
	 * @return
	 */
	@Bean
	public TestBean getBean() {
		TestBean testBean = new TestBean("zhaoyh");
		return testBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(HtsTaskApplication.class, args);
		System.out.println("Start Task..........");
	}

}
