package com.tnsif.firstpakage;

public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Base b1 = new Base();
//		b1.methodDefault();
//		b1.methodPublic();
//		b1.methedProtected();
//		//b1.methodPrivate();
//		
//		b1.varDefault=11;
//		b1.methodDefault();
//		
//		b1.varProtected=100;
//		b1.methedProtected();
		
		
		///Accessing the different package class
		
		Base b1 = new Base();
		
		//Private, default, protected and public
		
		b1.methodPublic();
		b1.varPublic=28373;
		b1.methodPublic();

	}

}
