package com.stringexample;

public class StringBulderExam {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Naresh");
		System.out.println(sb);
		System.out.println(sb.append("Rajesh"));
		System.out.println(sb.toString());
		System.out.println(sb.capacity());
//		System.out.println(sb.ensureCapacity(0));
		System.out.println(sb.substring(7));
		System.out.println(sb.substring(6, 12));
//		System.out.println(sb.setCharAt('n', 'm'));
	}

}
