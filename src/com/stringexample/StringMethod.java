package com.stringexample;

public class StringMethod {
	
	public static void main(String[] args) {
		String name = "Magesh";
		System.out.println(name.charAt(0));
		System.out.println(name.codePointAt(0));
		System.out.println(name.codePointBefore(3));
		System.out.println(name.codePointCount(0, 5));
		String name1 = "magesh";
		System.out.println(name1.compareTo(name));
		System.out.println(name1.compareToIgnoreCase(name));
		System.out.println(name.isEmpty());
		System.out.println(name.length());
		System.out.println(name.replace('g', 'h'));
	}

}
