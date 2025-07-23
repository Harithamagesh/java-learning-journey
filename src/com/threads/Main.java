package com.threads;

public class Main {
	public static void main(String[] args) {
		Example1 ex1=new Example1();
		Example2 ex2=new Example2();
		ex1.start();
		ex2.start();
	}

}
