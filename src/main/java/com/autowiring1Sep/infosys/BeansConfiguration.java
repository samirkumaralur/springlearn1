package com.autowiring1Sep.infosys;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

	@Bean("employeeBeanAnyName")
	public Employee getEmployee() {
		return new Employee();
	}

	@Bean("BeanSalaryAccount")
	public SalaryAccount getSalaryAccount() {
		SalaryAccount salaryAccount = new SalaryAccount();
		salaryAccount.setAccNumber(1234);
		salaryAccount.setName("Samir");
		salaryAccount.setBankName("IOB");
		return salaryAccount;
	}
}
