package com.autowiring1Sep.autowiring_concept.with_interface;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringInterfaceMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();

		AnimalManagement animalManagement = (AnimalManagement) context.getBean("animalManagementComponentBean");
		System.out.println(animalManagement.getAnimalLion().countOfAnimals());
		System.out.println(animalManagement.getAnimalLion().nameOfAnimal());
		
		System.out.println(animalManagement.getAnimalTiger().countOfAnimals());
		System.out.println(animalManagement.getAnimalTiger().nameOfAnimal());
	}

}
