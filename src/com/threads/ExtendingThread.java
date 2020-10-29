package com.threads;


//There can be no other parent class of C and D 

class C extends Thread
{

	public void run() {
		int i;
		for(i=1;i<=10;i++) {
			System.out.println(i+" Thread A");
		}
	}
}

class D extends Thread
{

	public void run() {
		int i;
		for(i=1;i<=10;i++) {
			System.out.println(i+" Thread B");
		}
	}
}



public class ExtendingThread {
public static void main(String[] args) {
	
	C o1=new C();
	D o2=new D();
	o1.start();
	o2.start();
	
}
}
