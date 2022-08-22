package com.Spring.Aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	@Before("execution(* com.Spring.Aop.Payment.*())")
	public void beforePayment() {
		System.out.println("Payment started.......");
	}
		
	@After("execution(* com.Spring.Aop.*.*())")
	public void afterPayment() {
		System.out.println("Payment Ended......");
	}
	
	@AfterThrowing("execution(* com.Spring.Aop.*.*())")
	public void afterThrowingPayment() {
		System.out.println("After Throwing Payment ......");
	}
	
	@AfterReturning("execution(* com.Spring.Aop.*.*())")
	public void afterReturningPayment() {
		System.out.println("After Returning Payment ......");
	}
	
	@Around("execution(* com.Spring.Aop.*.*())")
	public void aroundPayment(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("Before Payment Ended......");
			jp.proceed();
		System.out.println("After Payment Ended......");
	}
}
