
package com.tnsif.hierachicalInheritance;

public class HirarchicalDemo {

	public static void main(String[] args) {
		
		
		Person p1=new Person();
		System.out.println("------Person Details ------");
		System.out.println(p1);
		
		System.out.println("--------------------------");
		//Student s=new Student();
		Person p;
		p=new Person("dipali", "mumbai");
		System.out.println("Person Details "+ p);
		
		p=new Student("shital", "Nashik", "SY", 67.89f);
		System.out.println("Students details "+ p);
		
		p=new Employee("Isha", "Nagar", 1002, 450000, "Development");
		System.out.println("employee details "+ p);
		


		
	}

}
