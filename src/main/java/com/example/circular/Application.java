package com.example.circular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//import com.example.circular._04withFieldLazy.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
//04
//		ConfigurableApplicationContext for_04 = SpringApplication.run(Application.class, args);
//		UserService bean4 = for_04.getBean(UserService.class);
//		bean4.register("sahilvishwakarma@gmail.com");		
		
		ConfigurableApplicationContext for_04 = SpringApplication.run(Application.class, args);


	
	}

}
