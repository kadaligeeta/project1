package com.tns.programs1.scanner;
// entity class
public class Person {
	private String name;
	private int income;
	private int tax;
	//getters and setters are use to protect the data
	public String getName() {//used to read the data
		return name;
	}
	public void setName(String name) {//use to print the data
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	piblic void setIncome(int income) {
		this.income = income;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	//help you to print object in string format
	@override
	public String toString( ) {
		return "person [name=" + name + ", income=" + income + ", tax=" + tax + "]";
	}		
		
	}

}
