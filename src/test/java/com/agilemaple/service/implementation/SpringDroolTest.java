package com.agilemaple.service.implementation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.agilemaple.model.Payment;


public class SpringDroolTest {

	public static void main(String args[]) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml");
		PaymentServiceImpl bean = ((PaymentServiceImpl) applicationContext
				.getBean("PaymentServiceImpl"));

		Payment payment = new Payment();
		payment.setType("physical product");

		bean.callRules(payment);
		
		System.out.println(payment.getOutput());
		
		payment = new Payment();
		payment.setType("book");
		bean.callRules(payment);
		System.out.println(payment.getOutput());
		
		payment = new Payment();
		payment.setType("membership");
		bean.callRules(payment);
		System.out.println(payment.getOutput());
		
		payment = new Payment();
		payment.setType("upgrade");
		bean.callRules(payment);
		System.out.println(payment.getOutput());
		
		payment = new Payment();
		payment.setType("video");
		bean.callRules(payment);
		System.out.println(payment.getOutput());
		

	}

}
