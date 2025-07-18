package day12Runnable;

public class UsingRunnable implements Runnable {
	
	Thread t;
	int end;
	int start;
	String msg;

	public UsingRunnable(int end, int start, String msg) {
		super();
		this.end = end;
		this.start = start;
		this.msg = msg;
	}
	
	//Overrride
	public void run() {
		for(int i=end; i>start; i--)
		{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i + msg);
		}
	}

}
