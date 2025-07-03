package com.tnsif.firstpakage;

public class Base {
	
	// declare default , private, protected, and public variables
	
	int varDefault = 10;
	public int varPublic = 10;
	private int varPrivate = 30;
	protected int varProtected = 40;
	
	// declare default , protect , public and private methods
	
	void methodDefault()
	{
		System.out.println("Default access base class");
		System.out.println("Public variable: " + varDefault);
		
	}
	
	public void methodPublic()
	{
		System.out.println("Public access base class");
		System.out.println("public variable: " + varPublic);
	}
	
	private void methodPrivate()
	{
	    System.out.println("Public access base class");
		System.out.println("public variable: " + varPrivate);
		
	}
	
	protected void methedProtected()
	{
		System.out.println("Public access base class");
		System.out.println("public variable: " + varProtected);
	}


}
