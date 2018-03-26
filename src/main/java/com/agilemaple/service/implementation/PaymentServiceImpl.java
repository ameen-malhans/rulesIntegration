package com.agilemaple.service.implementation;

import org.drools.runtime.StatelessKnowledgeSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.agilemaple.model.Payment;

@Component("PaymentServiceImpl")
public class PaymentServiceImpl {

	@Autowired
	private ApplicationContext applicationContext;

	public void callRules(Payment payment) {

		StatelessKnowledgeSession statelessKnowledgeSession = (StatelessKnowledgeSession) applicationContext
				.getBean("paymentSession");
		statelessKnowledgeSession.execute(payment);
		
		
	}
	
	public void generatePackingSlip(Payment payment) {
		payment.getOutput().add("Generating Packing Slip");
	}
	
	public void createDuplicatePackingSlip(Payment payment) {
		payment.getOutput().add("Generating Duplicate Packing Slip");
	}
	
	public void activateMembership(Payment payment) {
		payment.getOutput().add("Activate Membership");
	}
	
	public void upgradeMembership(Payment payment) {
		payment.getOutput().add("Upgrade Membership");
	}
	
	public void emailToOwner(Payment payment) {
		payment.getOutput().add("Email to owner");
	}
	
	public void addFreeVideotoPackingSlip(Payment payment) {
		payment.getOutput().add("Add Free Video To Packing Slip");
	}
	
	public void generateCommissionPaymentToAgent(Payment payment) {
		payment.getOutput().add("Generate Commission Payment To Agent");

	}
}
