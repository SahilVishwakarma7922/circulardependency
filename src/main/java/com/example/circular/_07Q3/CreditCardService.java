package com.example.circular._07Q3;

import org.springframework.stereotype.Service;

@Service
public class CreditCardService implements PaymentService{


	@Override
	public void pay() {
		System.out.println("printing form credit card");
	}
	

}
