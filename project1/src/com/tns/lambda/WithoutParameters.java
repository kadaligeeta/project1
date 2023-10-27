package com.tns.lambda;

public class WithoutParameters {

	public static void main(String[] args) {
		Message m=()->{return "hello";};
		System.out.println(m.greet());
	}

}
