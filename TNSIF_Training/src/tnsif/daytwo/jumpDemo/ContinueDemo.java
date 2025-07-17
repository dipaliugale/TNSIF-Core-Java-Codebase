package tnsif.daytwo.jumpDemo;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int k=5; k<15; k++) 
		{
			//odd number are skipped
			
			if(k%2 != 0)
				continue;
			// Even number are skipped.
			System.out.println(k + " ");
		}

	}

}
