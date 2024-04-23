package com.example.configpropdemoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(DemoApplication.class, args);
		AppPropertiesDemo appPropertiesDemo = context.getBean(AppPropertiesDemo.class);
		appPropertiesDemo.display();
	}
}