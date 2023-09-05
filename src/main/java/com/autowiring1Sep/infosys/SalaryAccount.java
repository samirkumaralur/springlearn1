package com.autowiring1Sep.infosys;

import org.springframework.stereotype.Component;

@Component("componentSalaryAccount")
public class SalaryAccount {
	private long accNumber;
	private String bankName;
	private String name;

	public long getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
