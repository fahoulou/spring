package com.fab.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootStarterApplication {

	@Autowired
	private Message message;

	@RequestMapping("/")
	public String hello() {
		return "Hello : " + message.getValue();
	}

	public static void main(String[] args) {
		SpringApplication.run(BootStarterApplication.class, args);
	}
}
