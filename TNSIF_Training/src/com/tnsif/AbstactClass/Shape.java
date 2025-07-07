package com.tnsif.AbstactClass;

public abstract class Shape {
      
	protected float area;
	//abstract method
	public abstract void calArea(); //Abstract key word not use body
	
	//Solid method
	public void show()
	{
		System.out.println("Area of the shape is: " + area);
	}
	
}
