package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeExample {
	
	public static void main(String[] args) {
		
		Deque<String> ad = new ArrayDeque<String>();
		ad.add("Rose");
		ad.add("Lily");
		ad.add("Jasmine");
		System.out.println(ad);
		ad.addFirst("Tulip");
		ad.addLast("Sunflower");
		System.out.println(ad);
		ad.offerFirst("Daisy");
		ad.offerLast("Orchid");
		System.out.println(ad);
		ad.removeFirst();
		System.out.println(ad);
		ad.removeLast();
		System.out.println(ad);
		ad.pollFirst();
		ad.pollLast();
		System.out.println(ad);
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
	}

}
