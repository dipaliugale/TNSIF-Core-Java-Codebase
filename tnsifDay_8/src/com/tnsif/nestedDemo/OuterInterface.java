package com.tnsif.nestedDemo;

public interface OuterInterface {
	void calArea();
	
	interface Innerinterface {
		int id = 20;
		void print();
	}

}
