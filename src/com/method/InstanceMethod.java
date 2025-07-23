package com.method;

public class InstanceMethod {
//	public void display(int a, int b) {
//		System.out.println("Instance Method");
//		System.out.println(a-b);
//	}
//	
//	public static void main(String[] args) {
//		InstanceMethod im = new InstanceMethod();
//		im.display(70, 50);
//	}
	
//	public static void subraction(int x, int y) {
//		System.out.println(x-y);
//	}
//	public static void main(String[] args) {
//		InstanceMethod.subraction(500,200);
//	}
	
	public static int mul(int a, int b) {
		return(a*b);
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceMethod.mul(10, 2));
	}

}
