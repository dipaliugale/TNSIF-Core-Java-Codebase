package com.tnsif.dayfourteen.listDemo;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		List list = new ArrayList(); //dynamib bonding
		System.out.println(list.isEmpty());	
		
		list.add(10);
		list.add(20);
		list.add("Dipali");
		list.add("hitei");
		list.add("false");
		list.add(true);
		list.add(20);
		list.add(12.45f);
		list.add("s");
		
		System.out.println("List is "+ list);
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.size());
		
		System.out.println(list.contains(1));
		
		list.remove(false);
		System.out.println(list);
		
		System.out.println(list.remove(list.lastIndexOf(20)));
		System.out.println(list);
		
		System.out.println(list.indexOf(20));
		
		list.clear();
		System.out.println(list);
		
		System.out.println("----------------------------------------");
		
		//Generics
		
		List<String> names=new ArrayList<String>();
		names.add("Shital");
		names.add("Pratik");
		names.add("sonu");
		names.add("savita");
		names.add("kaurvaki");
		
		System.out.println(names);
		
		
		Collections.reverse(names);
		System.out.println(names);
		
		System.out.println(names.contains("Dip"));
		
		Collections.sort(names);
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println(names);
		
		//Traversing in list
		Iterator<String> i=names.iterator();
		while(i.hasNext())
			
		{
			String nm=i.next();
			System.out.print(nm+ " ");
		}
		System.out.println();
		System.out.println(names);
		
		ListIterator<String> li=names.listIterator(names.size());
		
		while(li.hasPrevious())
		{
			String nm=li.previous();
			System.out.println(nm);
		}
		
		
		
	}

}
