package com.tnsif.singleDimentionalArray;

public class ArrayOperations {
	
	//print int aaray
	static void PrintArray(int[] arr)
	{
		for(int i=0; i<arr.length; i++) 
		{
			System.out.println(arr);
		}
	}
	
	//variable argument function
	public static int getSum(int... n)
	{
		int sum=0;
		for(int no : n)
			sum+=no;
		return sum;
	}
	
	//coun no. of odd elements
	public static int getOddCount(int b[])
	{
		int count = 0;
		for (int i=0; i<b.length; i++)
		{
			if(b[i] % 2 !=0)
				count++;
		}
		return count;
	}
	
	public static int getCountEven(int b[])
	{
		return b.length-getOddCount(b);
	}
	
	public static void main(String[] args) {
		int n = 10;
		int a[]; //declaration
		a=new int[n]; //instatiation
		
		//Displaying the array
		ArrayOperations.PrintArray(a);
		
		
		//assignning values in array a
		for(int i=0; i<a.length; i++)
		{
			a[i]=5*i;
			ArrayOperations.PrintArray(a);
		}
		
		int b[] = {10, 20, 30, 40, 50};
		ArrayOperations.PrintArray(b);
		
		//calling of varialbes argument function
		System.out.println("Sum of array elements is: " + ArrayOperations.getSum(b));
		System.out.println("Sum of array is:" + ArrayOperations.getSum(b));
		
		b[2] = 999;
		ArrayOperations.PrintArray(b);
		
		//Displying the total odd and even number
		System.out.println("Odd number");
		
	}
}
