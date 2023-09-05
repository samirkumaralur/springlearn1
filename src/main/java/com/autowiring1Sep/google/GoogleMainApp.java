package com.autowiring1Sep.google;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GoogleMainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();
		
		Gmail gmail= context.getBean(Gmail.class); //Component bean
		System.out.println(gmail.getEmailId());
		System.out.println(gmail.getNoOfEmails());
		
	}

}
