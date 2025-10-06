package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
public class Main {
	@RequestMapping("/json-example")
	String jsonExample() {
		return "{\"message\": \"Hello, World!\"}";
	}
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
