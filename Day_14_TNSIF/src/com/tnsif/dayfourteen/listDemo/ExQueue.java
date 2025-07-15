package com.tnsif.dayfourteen.listDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExQueue {

	public static void main(String[] args) {
		Queue<Integer> r=new LinkedList<Integer>();
		
		r.add(6);
		r.add(10);
		r.add(12);
		r.add(13);
		r.add(2);
		
		System.out.println(r);
		
		int positionPeek=r.peek();
		System.out.println("Using peek method first value");
		
		int positionElement=r.element();
		System.out.println("Using elements method first value");
		
		Iterator itr=r.iterator();
		while(itr.hasNext());
		{
			System.out.print(itr.next() + "");
		}
		System.out.println();
		
		System.out.println(r.poll());
	

	}

}
