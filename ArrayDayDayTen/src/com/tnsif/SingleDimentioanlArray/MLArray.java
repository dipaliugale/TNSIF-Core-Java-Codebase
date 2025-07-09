package com.tnsif.SingleDimentioanlArray;

class MLArray {
	
		static void printArray(int c[][]) {
			System.out.println("Array of element are as followes");
			for(int i=0; i<c.length; i++) 
			{
				for(int j=0; j<c[i].length; j++) 
				{
					System.out.println(c[i][j]);
				}
				System.out.println();
			}
		
	}
	
	
	public class multidimentionalArrayDemo {
		public static void main(String arg[]) {
			int c[][] = { {12, 13}, {34, 56}, {56, 76}, {98,56} };
			System.out.println("Array is: "+c.length);
		}
	}

}
