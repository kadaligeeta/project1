package com.tns.staticprograms;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob=new Employee("geeta",31);
		System.out.println(ob);
		Employee companyName;// accessing the static variable using classname
		ob=new Employee("sree",32);
		System.out.println(ob);

	}

}
