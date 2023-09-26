package com.tns.Constructor;

public class Student extends Citizen {
	private static int rollno;
	private String collageName;

	public Student(String name, long adharno, String address, long phno, int rollno, String collageName) {
		super(name, adharno, address, phno);
		Student.rollno = rollno;
		this.collageName = collageName;

	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collageName=" + collageName + "]";
	}

	public Student(String name, long adharno, String address, long phno, String collageName, int rollno) {
		super(name, adharno, address, phno);
		Student.rollno = rollno;
		this.collageName = collageName;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		Student.rollno = rollno;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
