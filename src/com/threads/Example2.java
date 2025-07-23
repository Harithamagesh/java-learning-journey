package com.threads;

public class Example2 extends Thread{
	
	public void run() {
		String [] flower = {"Lily","Rose","Sunflower","Daisy","Tulip"};
		for(int i=0;i<flower.length;i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(flower[i] + " 2");
		}
	}

}
