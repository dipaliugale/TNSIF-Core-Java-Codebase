package com.tnsif.DayTwelve.ThreadJava;

public class ThreadMethodsDemo {

	public static void main(String[] args) {


		ChildThread t1 = new ChildThread(5, "First");
		ChildThread t2 = new ChildThread(10, "Second");

		t1.start();
		t2.start();
		
		Thread.currentThread().setName("Parent Thread"); //assigning name to main thread
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("Current Thread: " + Thread.currentThread());
		
		try {
			t1.join(); //wait current thread until t1 is dead
			t2.join(); //wait current thread until t2 is dead
		} catch (InterruptedException e)
		{
			Thread.currentThread().interrupt(); //Restor interruptede status
			System.err.println("Thread Interrupt: " + e.getMessage()); 
		}
		System.out.println("...End of Program....");
	}

}
