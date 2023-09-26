package com.tns.Constructor;
program to demonstrate Constructors
public class Customer {
	
	private String customerName;
	private int customerId;
	private String customerCity;
	//Default Constructor
	public Customer()
	{
		System.out.println("default");
	}
	//Parameterized Constructor
	public Customer(String customerName, int customerId, String customerCity ) {
		
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
