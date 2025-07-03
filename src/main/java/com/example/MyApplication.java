package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@SpringBootApplication  //meta annocation that combines @SpringBootConfiguration, @EnableAutoConfiguration, and @ComponentScan
public class MyApplication {

	@RequestMapping("/meow")    //this provides routing information - in this case for the root URL
	public String home() {
		return "meow.html"; //this will return the meow.html file from the resources/static directory
	}

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}

}