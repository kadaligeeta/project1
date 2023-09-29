package com.tns.Inheritance;
public class Bike {
	private String companyName;
	
// set getters and setters
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
// to string function
	@Override
	public String toString() {
		return "Bike [companyName=" + companyName + "]";
	}
	
	

}
