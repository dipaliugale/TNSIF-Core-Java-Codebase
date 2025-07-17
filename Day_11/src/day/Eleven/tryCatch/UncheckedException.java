package day.Eleven.tryCatch;

public class UncheckedException {
	
	public static void main(String arg[]) {
		int x[];
		try {
			x=new int[] {1,2,3,4,5,6};
			System.out.println(x[2]);
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.err.println("Specied index doesnot exit: "+ e.getMessage());
    	}
	}

}
