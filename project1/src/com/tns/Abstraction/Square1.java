package com.tns.Abstraction;

public class Square1 extends Shape {
private float side;


public Square1() {
	super();
	side=3.0f;
	
}

public void Square(float side) {
	Super();
	this.side=side;
	
}

	private void Super() {
	// TODO Auto-generated method stub
	
}

	@Override
	void calArea() {
		// TODO Auto-generated method stub
		super.area=side*side;
		
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

}
