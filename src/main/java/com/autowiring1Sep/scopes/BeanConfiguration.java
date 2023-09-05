package com.autowiring1Sep.scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguration {

	@Scope("prototype")
	@Bean("beanForBank")
	public Bank getBank() {
		return new Bank();
	}

	@Bean("icici")
	public Bank getIcici() {
		return new Bank();
	}
}
