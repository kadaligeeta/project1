package com.tns.Abstraction;

public class Rectangle extends Shape {
private float width,height;

@Override
public String toString1() {
	return "Rectangle [width=" + width + ", height=" + height + "]";
}



	public Rectangle() {
	super();
	this.width=4.5f;
	this.height=5.6f;
	
}



	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}



	@Override
	void calArea() {
		// TODO Auto-generated method stud
	super.area=width*height;	
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

}
