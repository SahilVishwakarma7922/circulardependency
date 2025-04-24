//package com.example.circular._04withFieldLazy;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//
//	@Autowired
//	@Lazy
//	private EmailService emailService;
//	
//	public void register(String username) {
//		System.out.println("user register with username "+username);
//		emailService.sendWelcomeMessage(username);
//	}
//	
//	
//}
