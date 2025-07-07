package com.tnsif.StaticDemo;

public class MyClassDemo {

	public static void main(String[] args) {


		MyClass.display();
		
		System.out.println();
		
		MyClass obj=new MyClass();
		System.out.println(obj);
		
		MyClass.display();
		MyClass obj2=new MyClass();
		System.out.println(obj2);
		
		MyClass obj1=new MyClass();
		System.out.println(obj1);
		

	}

}
