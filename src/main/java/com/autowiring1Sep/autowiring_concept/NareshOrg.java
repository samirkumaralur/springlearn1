package com.autowiring1Sep.autowiring_concept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NareshOrg {

	private String location;
	@Qualifier("springTrainerBean")
	@Autowired
	private Trainer springTrainer;

	@Qualifier("microservicesTrainerBean")
	@Autowired
	private Trainer microserviceTrainer;

	public Trainer getSpringTrainer() {
		return springTrainer;
	}

	public void setSpringTrainer(Trainer springTrainer) {
		this.springTrainer = springTrainer;
	}

	public Trainer getMicroserviceTrainer() {
		return microserviceTrainer;
	}

	public void setMicroserviceTrainer(Trainer microserviceTrainer) {
		this.microserviceTrainer = microserviceTrainer;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
