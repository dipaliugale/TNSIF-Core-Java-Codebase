package Day02;

import java.util.Scanner;

public class MaxMin_Value {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		System.out.println("Enter 2nd Number: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		
		if (n1>n2) {
			System.out.println("Max number is: " + n1);
		} else {
			System.out.println("Min number is: " + n2);
		}	
		
	}

 }
