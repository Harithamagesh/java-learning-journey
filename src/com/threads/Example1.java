package com.threads;

public class Example1 extends Thread{
	
	public void run() {
		String [] colours = {"black","blue","white","yellow","pink"};
		for(int i=0;i<colours.length;i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(colours[i]+ " 1");
		}
	}
}
