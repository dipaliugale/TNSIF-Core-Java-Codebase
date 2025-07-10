package tnsiffinally.Block;

public class gratervalueException extends Exception {
	
	public gratervalueException(String string)
	{
		super(string);
	}
	public gratervalueException()
	{
		super("percentage should not be grater than 100");
	}

}
