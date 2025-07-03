package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //indicates that this is a web controller
@SpringBootApplication  //meta annocation that combines @SpringBootConfiguration, @EnableAutoConfiguration, and @ComponentScan
public class MyApplication {

	@RequestMapping("/")    //this provides routing information - in this case for the root URL
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}

}