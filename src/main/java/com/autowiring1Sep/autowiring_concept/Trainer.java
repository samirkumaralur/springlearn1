package com.autowiring1Sep.autowiring_concept;

import org.springframework.stereotype.Component;

public class Trainer {
	private String trainerName;
	private String courseName;

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
