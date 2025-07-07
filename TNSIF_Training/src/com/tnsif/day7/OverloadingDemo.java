package com.tnsif.day7;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point(); //default
		System.out.println(p);
		
		Point p1 = new Point(34.4f,45.5f);
		System.out.println(p1);
		
		System.out.println("Methos Overloding");
		System.out.println(MethodOverloading.addition(3.14f, 34.6f));
		System.out.println(MethodOverloading.addition(1, 3, 4));
				

	}

}
