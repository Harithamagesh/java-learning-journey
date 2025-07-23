package com.threads;

public class Demo1 implements Runnable{

	@Override
	public void run() {
		
		String [] colours = {"black","blue","white","yellow","pink"};
		for(int i=0;i<colours.length;i++) {
			System.out.println(colours[i]+ " 1");
		}
		
	}

}
