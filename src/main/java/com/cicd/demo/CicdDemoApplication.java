package com.cicd.demo;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CicdDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdDemoApplication.class, args);
	}
	
	@Bean
	public Function<String,String> reverse(){
		
		return param-> new StringBuilder(param).reverse().toString();
		
	}

}
