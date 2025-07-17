package Day02;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int b = sc.nextInt();
		
		// Unary Operators
		System.out.println("Unary minus Operator: " + (-a) );
		System.out.println("Pre-Increment Operator: " + (++b));
		System.out.println("Post-Increment Operator: " + (a++));
		System.out.println("Pre-Decrement Operator: " + (--b));
		
		// Assignment Operator
		System.out.println("Addtion Operator: " + (a + b));
		System.out.println("Subtraction Operator: " + (b - a));
		System.out.println("Multiplication Operator: " + (a * b));
		System.out.println("Division Operator: " + (a / b));
		
		// Shift Operator
		System.out.println("");
		System.out.println("");
		System.out.println("");
		

	}

}
