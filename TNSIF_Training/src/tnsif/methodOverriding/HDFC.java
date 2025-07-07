package tnsif.methodOverriding;

public class HDFC extends RBI {
	
	public float getRateOfInterest()
	{
		System.out.println("base rate of interest");
		return 4.5f;
	}

}
