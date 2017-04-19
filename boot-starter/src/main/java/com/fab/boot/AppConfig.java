package com.fab.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Message message(@Value("${message}") String message) {
		Message msg = new Message();
		msg.setValue(message);
		return msg;
	}

}
