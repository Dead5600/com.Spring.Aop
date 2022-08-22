package com.Spring.Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Payment p	=context.getBean(Payment.class);
		p.makePayment();
	}

}
