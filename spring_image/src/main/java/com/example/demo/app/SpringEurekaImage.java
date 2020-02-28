package com.example.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient 	
public class SpringEurekaImage {
	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaImage.class, args);
	}
}
