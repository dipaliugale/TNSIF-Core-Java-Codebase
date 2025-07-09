package com.tnsif.SingleDimentioanlArray;


class JaggedArray {
	
	static void printArray(int c[][]) {
		System.out.println("Array of elements are follows");
		for(int i=0; i<c.length; i++) 
		{
			for(int j=0; j<c[i].length; j++) 
			{
				System.out.println(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}


public class JaggedArrayDemo {
	
	public static void main(String[] args) {

		int c[][] = { {12, 13, 56}, {34, 56}, {56, 76, 86,67}, {98,56} };
		System.out.print("Number of rows in c array is: " +c.length);
		JaggedArray.printArray(c);

	}

}
