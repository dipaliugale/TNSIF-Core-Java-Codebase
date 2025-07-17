package com.tnsif.StringDemo;

public class StringBufferDemo {

	public static void main(String[] args) {


		//String buffer Length
		StringBuffer buffer=new StringBuffer("Hello");
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		
		//Appending and inserting the buffer
		String s;
		int a = 42;
		buffer=new StringBuffer(40);
		s=buffer.append("a=").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(buffer);
		
		buffer=new StringBuffer("I java");
		buffer.insert(2, "like ");
		System.out.println(buffer);
		
		buffer.delete(3,  6);
		System.out.println(buffer);
		
		System.out.println(buffer.reverse());
	}

}
