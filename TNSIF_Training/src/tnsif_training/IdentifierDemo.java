package tnsif_training;

public class IdentifierDemo {
	public static void main(String args[]) {
		
		//Variable declaration - invalid identifier example
		
		  //int for = 13; error bcoz keyword cannot be declare as variable
		
		  // int num 1 = 13; Error bcoz of space
		
		  // int @num = 23; special symbol is not allowed only $ , _ are allowed
		
		// VAlid Identification
		
		int num1 = 20;
		
		String studentName = "Dipali";
		
		int FOR = 7; // UpperCase that why valid.
		
		System.out.println("Values of the variables is " + num1);
		
		System.out.println("Values of the variables is " + studentName);	
	}

}
