package com.java.OOP;

public class OopsConceptdemo {
	
	private String name;
	private int age;
	private int serialNum;
	
	// getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	@Override
	public String toString() {
		return "OopsConceptdemo [name=" + name + ", age=" + age + ", serialNum=" + serialNum + "]";
	}
	
	

}

