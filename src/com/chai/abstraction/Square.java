package com.chai.abstraction;

public class Square extends Shape {

	float a;
	
	
	public Square(float a) {
		super();
		this.a = a;
	}


	@Override
	void area() {
		
		area = a*a;
		
	}

}
