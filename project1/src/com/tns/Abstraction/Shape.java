package com.tns.Abstraction;
//program to demonstrate abstraction in java
//Abstract class
public abstract class Shape {
	protected float area;
	// Abstract method
	abstract void calArea();
	
	void show() {// concrete method
		System.out.println("Area of shape is"+area);
		
	}

	public String toString1() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
