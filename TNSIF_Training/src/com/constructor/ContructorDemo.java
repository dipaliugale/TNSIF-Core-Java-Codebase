package com.constructor;

import java.util.*;

public class ContructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String name, city;
		int id;
		System.out.println("Enter customer id");
		id=sc.nextInt()
;
		sc.nextLine();
		System.out.println("Enter customer name");
		
		name=sc.nextLine();
		System.out.println("Enter customer city");
		city=sc.nextLine();
		
		System.out.println(" ");
		
		Customer c1 = new Customer();
		c1.setCustomerCity(city);
		c1.setCustomerId(id);
		c1.setCustomerName(name);
	}

}
