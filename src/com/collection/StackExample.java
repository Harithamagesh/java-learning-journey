package com.collection;

import java.util.Stack;

public class StackExample {
	
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("Monkey");
		s.push("Dog");
		s.push("Rat");
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.search("Monkey"));
		System.out.println(s.size());
		System.out.println(s.contains("Dog"));
		System.out.println(s.empty());
	
		
	}

}
