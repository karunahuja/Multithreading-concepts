package com.threads;

public class ImplementsRunnableLambda {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i <= 10; i++) {

				System.out.println("Thread A " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}});
		
		
		
		Thread t2 = new Thread(() -> {
			int i;
			for (i = 0; i <= 10; i++) {

				System.out.println("Thread B " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		t1.setName("Hi thread");
		t2.setName("Hello thread");
		System.out.println(t1.getName());
		System.out.println(t2.getName());	
	
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		

		
		
		t1.start();
		
		t2.start();
//main will wait for t1 and t2 to join again i.e. execute their job		
		
		System.out.println(t1.isAlive());
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive()); 
		System.out.println("Bye");

	}
}
