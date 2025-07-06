package com.tnsif.StaticDemo;

public class MyClass {
	
	private int section; //non static variable or instance variable
	
	private static int srNo; // Static or class variable
	
	//Static block
	static
	{
		System.out.println("Within Static block");	
		srNo=1000;
//		section=9;
		
	}

	//default constructor
	public MyClass() {
          
		System.out.println("default constructor");
		srNo++;
		section++;

	}

	//to string
	@Override
	public String toString() {
		return "MyClass [serial No " + srNo + " section= " + section + "]";
	}
	 
	//method Static
	static void display()
	{
		// System.out.println("Section: " + section);
		
		System.out.println("Serial No: " + srNo);
	}
	
	

}
