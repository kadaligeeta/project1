package com.tns.lambda;

public class WithParameters {

	public static void main(String[] args) {
		
	Cube c=(a)->{return a*a*a;};
	System.out.println(c.calculate(6));
	}

}
