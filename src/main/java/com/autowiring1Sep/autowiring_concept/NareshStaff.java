package com.autowiring1Sep.autowiring_concept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("nareshStaffComponentBean")
public class NareshStaff {

	@Qualifier("basicTrainerBean")
	@Autowired
	private Trainer trainer;

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
}
