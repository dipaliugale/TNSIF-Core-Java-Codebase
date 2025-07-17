package tnsif.methodOverriding;

public class ICICI extends RBI {
	
	public float getRateOfInterest()
	{
		System.out.println("base rate of interest");
		return 4.5f;
	}

}
