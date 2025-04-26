package com.example.circular._07Q3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config1 {

	@Bean
	public CreditCardService creditCardService() {
		return new CreditCardService();
	}
	
}
