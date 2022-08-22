package com.Spring.Aop;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Payment {

	private int amount;

	public void makePayment() {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the amount");		
		amount = sc.nextInt();
		
		if (amount <500)
			{
			throw new LowAmount("Amount you have entered is too Low");
			}
		else if(amount >10000)
			throw new HighAmount("Amount you have entered is too high");
		else
			System.out.println("Payment is procssing");
	}
	
	class LowAmount extends RuntimeException{
		
		public LowAmount(String s) {
			super(s);
		}
	}
	
	class HighAmount extends RuntimeException{
		
		public HighAmount(String s) {
			super(s);
		}
	}
}
