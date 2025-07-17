package tnsiffinally.Block;

import java.util.*;

public class UsingThrow {
	
	static int acceptNumber()
	{
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	public static void main(String args[]) {
		int per;
		
		System.out.println("Enter your percentage...");
		
		per = acceptNumber();
		try {
			if(per<0)
				throw new negativeException();
			else if(per>0)
				throw new gratervalueException();
			else System.out.println("Valid percentages");
		} catch(negativeException | gratervalueException e) 
		{
			System.err.println("Error: " + e.getMessage());
		}
	}
	

}
