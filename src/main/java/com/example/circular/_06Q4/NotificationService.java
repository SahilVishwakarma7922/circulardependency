package com.example.circular._06Q4;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

	private MessageService messageService;
	
	public NotificationService(MessageService messageService) {
		this.messageService=messageService;
	}
	
	public void sendNotification(String message,String user) {
		messageService.sendMessage(user);
		
		System.out.println("message sent succcesfully to user "+user +" and messagge is "+message);
	}
	
}
