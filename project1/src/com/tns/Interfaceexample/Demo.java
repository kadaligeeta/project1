package com.tns.Interfaceexample;
//Multiple inheritance achived by interface 
public class Demo implements ChildInterface,InterfaceOne{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print method");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show method");
		
	}

}
