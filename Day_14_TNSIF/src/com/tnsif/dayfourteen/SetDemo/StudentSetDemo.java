package com.tnsif.dayfourteen.SetDemo;

import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {

	public static void main(String[] args) {
		Set<Student> set=new HashSet<Student>();
		set.add(new Student(101, "Dipali", 45.09));
		set.add(new Student(1012, "heti", 56.09));
		set.add(new Student(105, "zeel", 32.09));
		set.add(new Student(101, "Dipali", 45.09)); //duplicate
		set.add(new Student(101, "Dipali", 45.09));
		
		System.out.println(set);	

	}

}
