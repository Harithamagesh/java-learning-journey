package com.threads;

public class Demo2 implements Runnable{

	@Override
	public void run() {
		String [] flower = {"Lily","Rose","Sunflower","Daisy","Tulip"};
		for(int i=0;i<flower.length;i++) {
			System.out.println(flower[i] + " 2");
		}
		
	}

}
