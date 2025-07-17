package com.tnsif.DayTwelve.ThreadJava;

public class ChildDemo {

	public static void main(String[] args) {


		ChildThread c = new ChildThread(10, "dipali");
		ChildThread c1 = new ChildThread(3, "TNSIF");
		c.start();
		c1.start();
		System.out.println("Code is end");

	}

}
