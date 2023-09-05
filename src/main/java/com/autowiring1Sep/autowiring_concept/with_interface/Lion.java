package com.autowiring1Sep.autowiring_concept.with_interface;

import org.springframework.stereotype.Component;

@Component("lionComponentBean")
public class Lion implements Animal {

	public String nameOfAnimal() {
		return "Lion";
	}

	public int countOfAnimals() {
		return 100;
	}

}
