package com.autowiring1Sep.scopes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringScopeMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();
		
		// Here just because the scope is prototype
		// each time different object reference of bank is returned
		//1st Time
		Bank bank1= (Bank) context.getBean("beanForBank");
		System.out.println(bank1);
		
		//2nd time
		Bank bank2= (Bank) context.getBean("beanForBank");
		System.out.println(bank2);
		
		//3rdTime
		Bank bank3= (Bank) context.getBean("beanForBank");
		System.out.println(bank3);
		
		//Here Scope is not used, hence every time 
		//Same Object reference of icici bean is returned
		
		Bank iciciBank1= (Bank) context.getBean("icici");
		System.out.println(iciciBank1);
		
		Bank iciciBank2= (Bank) context.getBean("icici");
		System.out.println(iciciBank2);
		
		Bank iciciBank3= (Bank) context.getBean("icici");
		System.out.println(iciciBank3);
	}

}
