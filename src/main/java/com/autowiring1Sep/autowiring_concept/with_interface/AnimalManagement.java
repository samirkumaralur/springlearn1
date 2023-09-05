package com.autowiring1Sep.autowiring_concept.with_interface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("animalManagementComponentBean")
public class AnimalManagement {
	

	@Qualifier("lionComponentBean")
	@Autowired
	private Animal animalLion;

	@Qualifier("tigerBeanComponent")
	@Autowired
	private Animal animalTiger;

	public Animal getAnimalLion() {
		return animalLion;
	}

	public void setAnimalLion(Animal animalLion) {
		this.animalLion = animalLion;
	}

	public Animal getAnimalTiger() {
		return animalTiger;
	}

	public void setAnimalTiger(Animal animalTiger) {
		this.animalTiger = animalTiger;
	}

}
