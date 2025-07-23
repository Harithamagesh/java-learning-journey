package com.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> num = new TreeSet<Integer>();
		num.add(10);
		num.add(30);
		num.add(50);
		num.add(20);
		num.add(40);
		System.out.println(num);
		System.out.println(num.first());
		System.out.println(num.last());
		System.out.println(num.ceiling(37));
		System.out.println(num.ceiling(30));
		System.out.println(num.floor(45));
		System.out.println(num.floor(20));
		System.out.println(num.pollFirst());
		System.out.println(num.pollLast());
		System.out.println(num.descendingSet());
	}

}
