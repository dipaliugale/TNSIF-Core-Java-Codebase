package com.tnsif.singleDimentionalArray;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		
		
		//get the array
		int intArr[] = {69, 20, 12, 40, 35};
		
		//print thee array
		System.out.println(Arrays.toString(intArr));
		
		for(int i=0; i<intArr.length; i++) 
		{
			System.out.print(intArr[i] + " ");
		}
		
		System.out.println();
		
		//Sort
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		//Binary Search
		System.out.println(Arrays.binarySearch(intArr, 50));
		
		//comparison
		System.out.println(Arrays.toString(intArr));
		
		//get second array
		int intArr1[] = {69, 20, 12, 20, 50};
		System.out.println();
		
		///comparison both the array
		if(Arrays.compare(intArr, intArr1)==0)
		{
			System.out.println("Both array are same");
		}
		else
		{
			System.out.println("Both are are not same");
		}

			
	    //copy array
		int intArr2[] = Arrays.copyOf(intArr1, 2);
		System.out.println(Arrays.toString(intArr2));
		
		int intArr3[] = Arrays.copyOfRange(intArr1, 2, 4);
		System.out.println(Arrays.toString(intArr3));
		
		
		//fill method
		Arrays.fill(intArr3, 7);
		System.out.println(Arrays.toString(intArr3));
			
	}

}
