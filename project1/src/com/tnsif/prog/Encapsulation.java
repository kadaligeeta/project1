//program to illustrate Data Encapsulation
package com.tnsif.prog;

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
