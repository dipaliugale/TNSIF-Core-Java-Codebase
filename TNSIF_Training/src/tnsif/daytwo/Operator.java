package tnsif.daytwo;

public class Operator {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		
		System.out.println("A and B value before the operator: " + a + " "+ b);
		++a;
		
		int e = ++a + b + a--;
		System.out.println("e value after the operation: "+ e);
		
		int d = c++ + a + a--;
		System.out.println("d value sfter the operation: "+ d);
		

	}

}
