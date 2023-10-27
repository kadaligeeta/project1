package com.tns.exceptions;

import java.util.InputMismatchException;

//program to demonstrate try catch
public class WithExceptions {
	
	public static void divide() {
		int a=6,b=0,c;
		try {// exception is raised
			c=a/b;
		
	    }
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Caught"+e.getMessage());	
			
		}
		catch(InputMismatchException e) {
			System.out.println("Exception Caught"+e.getMessage());	
	}
		catch(ArithmeticException e) {// exception is handeled and e is object of exception
	    	System.out.println("Exception Caught"+e.getMessage());

	
	}
		catch(Exception e) {//exception is handle and e is object of exception
			System.out.println("Exception Caught"+e.getMessage());
			}
		finally {
			System.out.println("this will be executed");
		}
		}
}

