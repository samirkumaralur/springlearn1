package com.autowiring1Sep.autowiring_concept.with_interface;

import org.springframework.stereotype.Component;

@Component("tigerBeanComponent")
public class Tiger implements Animal {

	public String nameOfAnimal() {
		return "Tiger";
	}

	public int countOfAnimals() {
		return 500;
	}

	
}
