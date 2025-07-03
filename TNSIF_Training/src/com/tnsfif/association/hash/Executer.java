package com.tnsfif.association.hash;

public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address address = new Address(" nagar", "Pune", "Maharashtra", "414607");
	
	
		Person p=new Person("DipaliS", address);
		p.displayInfo();
		System.out.println(p);
	
	
	}

}