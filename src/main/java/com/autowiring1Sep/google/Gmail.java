package com.autowiring1Sep.google;

import org.springframework.stereotype.Component;

@Component
public class Gmail {
	private String emailId;
	private int noOfEmails;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getNoOfEmails() {
		return noOfEmails;
	}

	public void setNoOfEmails(int noOfEmails) {
		this.noOfEmails = noOfEmails;
	}

}
