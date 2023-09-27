package com.tns.Constructor;

public class Student extends Citizen{
	private int rollno;
	private String collegeName;

	public Student() {
		super();
	}
	
	//public Student(int rollno,String collegename) {
	//	super();
	//	this.rollno=rollno;
		
	public Student(String name, long adharno, String address, long phno) {
		super(name, adharno, address, phno);
		// TODO Auto-generated constructor stub
		this.rollno=rollno;
		this.collegeName=collegeName;
	}

	//}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getcollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		collegeName = collegeName;
	}
	//@Override
	//public String toString() {
		//return "Student [rollno=" + rollno + ", collegeName=" + collegeName + "]";
	//}
	
	

}
