package com.tnsif.SingleDimentioanlArray;

public class Student {
	
	//data member
	private int Rollno;
	private  String name;
	
	//para contructor
	public Student(int rollno, String name) {
		super();
		Rollno = rollno;
		this.name = name;
	}
	
	//Getter and setter
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
