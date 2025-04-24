package com.example.circular._03WithSetter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

 	private UserService userService;
	
 	@Autowired
	public void setUserService(UserService userService) {
 		this.userService=userService;
 	}
 	
}
