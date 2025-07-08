package com.tnsif.nestedDemo;

public class NestedDemo implements OuterInterface, OuterInterface.Innerinterface {
	
    public void calArea() {
    	System.out.println("Outer Interface");
    	
    }
     public void print() {
    	 System.out.println("Inner interface");
     }
}
