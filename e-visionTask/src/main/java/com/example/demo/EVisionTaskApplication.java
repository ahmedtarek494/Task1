package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
"com.example.demo.Rest", "com.example.demo.DTOs","com.example.demo.bussiness"})
public class EVisionTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(EVisionTaskApplication.class, args);
	}

}
