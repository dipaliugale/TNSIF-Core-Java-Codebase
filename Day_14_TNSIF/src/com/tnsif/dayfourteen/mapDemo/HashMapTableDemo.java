package com.tnsif.dayfourteen.mapDemo;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class HashMapTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(101,"mumbai");
		ht.put(102,"new mumbai");
		ht.put(103,"pune");
		ht.put(101,"Ahilyanagar");
		ht.put(101,"new mumbai");
		
		System.out.println(ht);
		ht.putIfAbsent(105, "PCMC");
		ht.put(101,"Baramati");
		
		System.out.println(ht);
		
		//ht.put(null, "morya");
		System.out.println(ht);
		
		System.out.println(ht.get(103));
		
		System.out.println(ht.replace(102,"Bombay"));
		System.out.println(ht);
		
		ht.clone();
		System.out.println(ht);
		
		Set s=ht.keySet();
		System.out.println(s);
		
		Collection<String> c=ht.values();
		System.out.println(c);
		
		

	}

}
