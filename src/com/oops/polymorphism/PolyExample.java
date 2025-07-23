package com.oops.polymorphism;

public class PolyExample {
	
	public void name(int a, double b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	public void name(int x, int y) {
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		PolyExample poly = new PolyExample();
		poly.name(10, 20);
		poly.name(30, 40);
	}

}
