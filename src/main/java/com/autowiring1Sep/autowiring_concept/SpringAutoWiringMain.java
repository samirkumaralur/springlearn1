package com.autowiring1Sep.autowiring_concept;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAutoWiringMain {

	public static void main(String[] args) {
		
		
		/*
		 * AUTOWIRING
		 * 
		 * lets says that there is a POJO class called 'Trainer'
		 * In the BeanConfiguration class, we are making this 'Trainer' Class as BEAN
		 * Also, lets says that we are SETTING VALUES as well to the properties of 'TRAINER' Class in BeanConfiguration class
		 * Now to access these SET values of 'Trainer' class in another POJO class lets says 'NareshStaff', then we can set these values to 'trainer' property
		 * 		- by adding @AutoWiring and also most IMPORTANTLY mentioning the beanName 'basicTrainerBean' above the property 'trainer' declaration
		 *      - Then values set in bean 'basicTrainerBean' will be injected in the property 'trainer'     
		 * */

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();

		NareshOrg nareshOrg = context.getBean(NareshOrg.class);
		System.out.println(nareshOrg.getLocation());
		System.out.println(nareshOrg.getSpringTrainer().getTrainerName());
		System.out.println(nareshOrg.getSpringTrainer().getCourseName());
		
		System.out.println(nareshOrg.getMicroserviceTrainer().getTrainerName());
		System.out.println(nareshOrg.getMicroserviceTrainer().getCourseName());
		
		
		NareshStaff nareshStaff= (NareshStaff) context.getBean("nareshStaffComponentBean");
		System.out.println(nareshStaff.getTrainer().getTrainerName());
		System.out.println(nareshStaff.getTrainer().getCourseName());
	}

}
