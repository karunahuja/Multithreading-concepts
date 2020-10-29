package com.threads;

class A implements Runnable {
	public void run() {
		int i;
		for (i = 0; i <= 10; i++) {

			System.out.println("Thread A " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

class B implements Runnable {
	public void run() {
		int i;
		for (i = 0; i <= 10; i++) {

			System.out.println("Thread B " + i);

		}
		

	}

}

public class ImplementsRunnable {

	public static void main(String[] args) {

		Thread t1 = new Thread(new A());
		Thread t2 = new Thread(new B());
		t1.start();
		t2.start();

	}
}
