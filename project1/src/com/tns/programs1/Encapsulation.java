//program to illustrate Data Encapsulation
package com.tns.programs1;

public class Encapsulation {
	protected int serialno;// datamenbers
	public String name;
	int age;
	public void show() // members function
	{
	System.out.println("serialno"+ serialno+ "\t"+ "name"+ name+ "\t"+ "age"+ age);
	
	}
	public Encapsulation() {//explicit default constructor
		System.out.println("hello");
	}
}