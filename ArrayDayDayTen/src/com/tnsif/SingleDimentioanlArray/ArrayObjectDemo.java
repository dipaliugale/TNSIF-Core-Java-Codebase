package com.tnsif.SingleDimentioanlArray;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student []=new Student(0, null);
		Student [] arr;
		
		arr=new Student[5];
		
		arr[0] = new Student(101, "Dipa");
		arr[1] = new Student(102, "Shita");
		arr[2] = new Student(103, "prat");
		arr[3] = new Student(104, "Savi");
		arr[4] = new Student(105, "Sana");
		
		for(int i=0; i<=arr.length; i++) {
			System.out.println("Elements at"+ i+": "+ arr[i].getRollno()+arr[i].getName());
		}

	}

}
