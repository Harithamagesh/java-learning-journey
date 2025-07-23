package com.threads;

public class Main2 {
	public static void main(String[] args) throws InterruptedException {
		Demo1 d1 = new Demo1();
		Thread t1 = new Thread(d1);
		
		Demo2 d2 = new Demo2();
		Thread t2 = new Thread(d2);
		t1.start();
		t2.start();
		
		t1.sleep(1000);
		t2.sleep(1000);
		
		t1.join();
		t2.join();
		
		System.out.println("finished");
	}

}
