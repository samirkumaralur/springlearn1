package com.autowiring1Sep.infosys;

import org.springframework.stereotype.Component;

@Component("componenthydlocation")
public class HydLocation {
	private String areaName;
	private int pincode;

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}



}
