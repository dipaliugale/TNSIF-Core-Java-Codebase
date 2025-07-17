package tnsif.methodOverriding;

public class SBI extends RBI {
	
	//@override
	public float getRateofInterest()
	{
		System.out.println("Base rate of interest");
		return 4.5f;
		
	}

}
