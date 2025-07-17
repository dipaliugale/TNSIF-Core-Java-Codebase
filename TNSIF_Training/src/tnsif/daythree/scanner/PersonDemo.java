package tnsif.daythree.scanner;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		//Scanner object to accept user input
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.println("Enter person name: ");
		
		name = sc.next();
		System.out.println("Enter age: ");
		
		int age = sc.nextInt();
		System.out.println("Enter gender: ");
		String gender = sc.next();
		
		System.out.println("Enter mobile number: ");
		long mobile = sc.nextLong();
		System.out.println("Enter income: ");
		int income = sc.nextInt();
		
        // person object and initialization values using setter
		
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.getMobileNumber();
		person.setIncome(income);
		
		// by using getter
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getGender());
		System.out.println(person.getIncome());
		System.out.println(person.getMobileNumber());
		System.out.println(person.getTax());
		
		
		
		System.out.println(person);
		
		TaxCalculator calc = new TaxCalculator();
		calc.calculateTax(person);
		System.out.println("After calculation of the tax: ");
		

	}

}
