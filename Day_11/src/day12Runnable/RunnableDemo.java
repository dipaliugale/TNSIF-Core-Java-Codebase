package day12Runnable;

public class RunnableDemo {
	
	public static void main(String args[]) {
	
	// Runnable r=new UsingRunnable(10, 1, "heti);
	// Thread t=new Thread(r);
	// t.start();
		
		
		//Using Lambda Expression
		Runnable r1 = () -> System.out.println("Runnable using lambda expression");
		new Thread(r1).start();
	
	}

}
