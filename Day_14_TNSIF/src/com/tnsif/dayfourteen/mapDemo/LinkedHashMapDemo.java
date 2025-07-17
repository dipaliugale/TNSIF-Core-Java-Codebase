package com.tnsif.dayfourteen.mapDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap ht=new LinkedHashMap();
		ht.put(101,1000);
		ht.put(1012,233.34);
		ht.put(101,"Diapli");
		ht.put(101,1000);
		ht.put(101,1000);
		
		System.out.println(ht);

	}

}
