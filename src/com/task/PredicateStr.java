package com.task;

import java.util.function.Predicate;

public class PredicateStr {
	
	public static void main(String[] args) {
		
		Predicate<String> pre = str -> str.length() > 5;
		System.out.println(pre.test("Haritha"));
		System.out.println(pre.test("hari"));
		Predicate<String> emp = str -> str.isEmpty();
		System.out.println(emp.test(""));
		System.out.println(emp.test("java"));
		Predicate<String> con = str -> str.contains("a");
		System.out.println(con.test("Naresh"));
		Predicate<String> start = str -> str.startsWith("N");
		System.out.println(start.test("Naresh"));
		Predicate<String> end = str -> str.endsWith("a");
		System.out.println(end.test("Haritha"));
		
		
		
	}

}
