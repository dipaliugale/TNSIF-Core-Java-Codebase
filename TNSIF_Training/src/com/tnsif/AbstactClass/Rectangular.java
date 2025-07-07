package com.tnsif.AbstactClass;

public class Rectangular extends Shape {
	
	float width;
	float height;
	
	
	public Rectangular() {
		float width=2.4f;
		float height=5.7f;
	}


	public Rectangular(float width, float height) {
		this.width = width;
		this.height = height;
	}


	@Override
	public void calArea() {
		this.area=width*height;
	}
	
	
	

}
