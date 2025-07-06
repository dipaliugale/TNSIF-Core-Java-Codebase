package com.tnsif.FinalDemo;

public class FinalVariables {
	
	//final int a; // final instance variable must be initialize
	
	final int x = 100;
	
	//declare blank final variable
	final static int y;
	
	//declare and initialize
	final static int z=10;
	
	//instance methods
	void change()
	{
//		a=20;
//		x=30; // final variable can't be change or assign
//		z=50;
	}

	@Override
	public String toString() {
		return "FinalVariables [x=" + x + " y=" + y +"]";
	}
	
	// static block
	static
	{
		y=20;
		//z=80; //once initialized can't be reassigned
		System.out.println();
	}
	

}
