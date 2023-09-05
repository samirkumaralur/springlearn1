package com.autowiring1Sep.autowiring_concept;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigurationAutoWiring {

	@Bean("basicTrainerBean")
	public Trainer getBasicTrainer() {
		Trainer t= new Trainer();
		t.setCourseName("basic");
		t.setTrainerName("basicName");
		return t;
	}
	
	@Bean("springTrainerBean")
	public Trainer getSpringTrainer() {
		Trainer t= new Trainer();
		t.setCourseName("spring");
		t.setTrainerName("spring Trainer Name");
		return t;
	}
	
	@Bean("microservicesTrainerBean")
	public Trainer getMicroservicesTrainer() {
		Trainer t= new Trainer();
		t.setCourseName("Microservices");
		t.setTrainerName("Microservices Trainer Name");
		return t ;
	}
}
