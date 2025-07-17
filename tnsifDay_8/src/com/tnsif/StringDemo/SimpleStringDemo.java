package com.tnsif.StringDemo;

public class SimpleStringDemo {
	public static void main(String args[]) {
		char c[] = {'I','n','d','i','o'};
		
		String s1 = new String(c);
		System.out.println(s1);
		
		String s2 = new String(c);
		System.out.println(s2);
		
		//Concantinante to prevent String
		String longerstr = "This is to show" + " how long sentence" + " can be printerd";
		System.out.println(longerstr);
	}

}
