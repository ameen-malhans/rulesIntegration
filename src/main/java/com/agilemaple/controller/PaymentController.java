package com.agilemaple.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.agilemaple.model.Payment;
import com.agilemaple.service.implementation.PaymentServiceImpl;





@Controller
@RequestMapping("/api") //used to map web requests to Spring Controller methods
public class PaymentController {
	
	@Autowired
	private PaymentServiceImpl paymentServiceImpl;

	@RequestMapping(value = "/payment/{type}", method = RequestMethod.GET)
	public @ResponseBody Payment processPayment(@PathVariable("type") String type) {
		Payment payment = new Payment();
		payment.setType(type);
		paymentServiceImpl.callRules(payment);
		return payment;
	}
}
