package com.method;

public class Variable {
	int a = 10;
	int b = 20;
	
	public void x1() {
		int c = 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public void x2(int b) {
		int d = 40;
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		
	}
	
	public static void main(String[] args) {
		Variable obj = new Variable();
		obj.x2(13);
	}

}
