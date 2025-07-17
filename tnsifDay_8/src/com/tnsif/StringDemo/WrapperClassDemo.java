package com.tnsif.StringDemo;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		//unboxing
		Integer i=new Integer(10);
		System.out.println(i);
		int b=i.intValue();
		System.out.println(b);
		
		//without using int value()
	    int c=i;
	    System.out.println(c);
	    
	    //Autoboxing
	    int a=100;
	    Integer il=a;
	    System.out.println(il);
	    
	}

}
