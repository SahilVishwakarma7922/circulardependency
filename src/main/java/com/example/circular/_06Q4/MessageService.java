package com.example.circular._06Q4;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

	public void sendMessage(String user) {
		System.out.println("hello "+user+" you have some important messagge please check");		
	}

	
}
