package com.tnsif.dayfourteen.listDemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExQueueDemo {

	public static void main(String[] args) {
            
		Deque<String> deque1=new ArrayDeque<String>();
		
		deque1.add("Dipali");
		deque1.add("Sonali");
		deque1.add("Shital");
		deque1.add("Pratik");
		deque1.add("Kaurvaki");

		System.out.println(deque1);
		
		
		deque1.pollLast();
		System.out.println(deque1);
		
		deque1.pollFirst();
		System.out.println(deque1);
		
		for(String str : deque1)
		{
			System.out.println("queue is: " + str);
		}
		
		System.out.println(deque1);

	}

}
