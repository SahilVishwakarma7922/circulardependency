package com.example.circular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.circular._06Q4.NotificationService;
import com.example.circular._07Q3.CreditCardService;

//import com.example.circular._04withFieldLazy.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
//04
//		ConfigurableApplicationContext for_04 = SpringApplication.run(Application.class, args);
//		UserService bean4 = for_04.getBean(UserService.class);
//		bean4.register("sahilvishwakarma@gmail.com");		
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);


		
//		xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx  Q4    xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		
//		NotificationService bean = context.getBean(NotificationService.class);
//		bean.sendNotification(" account is credited for 80000rs ", " sahil ");

		
		
//		xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxccxxxxx Q3    xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		
		
		CreditCardService cc = context.getBean(CreditCardService.class);
		cc.pay();
		
	}

}
