package com.example.circular._06Q4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public MessageService messageService() {
		return new MessageService();
	}
	
	@Bean
	public NotificationService notificationService() {
		MessageService messageService=new MessageService();
		return new NotificationService(messageService);
	}
	
	
	
}
