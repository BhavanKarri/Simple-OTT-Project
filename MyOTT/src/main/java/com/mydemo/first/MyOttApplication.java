package com.mydemo.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource("classpath:configuration.xml")
public class MyOttApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(MyOttApplication.class, args);
	}

}
