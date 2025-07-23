package com.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	
	public static void main(String[] args) {
		List<Integer> num = new LinkedList<Integer>();
		num.add(2);
		num.add(4);
		num.add(6);
		System.out.println(num);
		num.addFirst(0);
		num.addLast(8);
		System.out.println(num);
		num.remove(0);
		System.out.println(num);
		num.removeFirst();
		System.out.println(num);
		num.removeLast();
		System.out.println(num);
		System.out.println(num.get(1));
		System.out.println(num.getFirst());
		System.out.println(num.getLast());
		System.out.println(num.size());
//		num.clear();
		
	}

}
