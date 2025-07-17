package com.tnsif.StringDemo;

public class StringComparisonDemo {
	public static void main(String args[]) {
		
		//creating string using literals
		String s1="DIPALI";
		String s2="DIPALI";
		
		//Creating new string operator //heap memory
		
		String s3 = new String("DIPALI");
		String s4 = new String("DIPALI");
		
		//==
		
		System.out.println("case 1 :" + s1==s2); //true
		System.out.println("case 2 :" + s1==s3); //false
		System.out.println("case 3 :" + (s2.equals(s1))); //true
		System.out.println("case 4 :" + (s2.equals(s4)));//tr3ue
		System.out.println("case 5 :" + (s3==s4));//false
		System.out.println("case 6 :" + (s3.equals(s4))); //true
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
		//compare by using compareTo
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareToIgnoreCase(s4));
		
		
		
	}

}
