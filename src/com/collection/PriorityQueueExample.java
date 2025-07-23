package com.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	
	public static void main(String[] args) {
		
		Queue<String> names=new PriorityQueue<String>();
		names.add("Haritha");
		names.add("Swathika");
		names.add("Harshini");
		names.add("Dhanasri");
		names.add("Nivetha");
		
		System.out.println(names);
		names.offer("kavi");
		System.out.println(names);
		names.remove(); //fifo
		System.out.println(names);
		names.remove(); //fifo
		System.out.println(names);
		names.poll();
		System.out.println(names);
		
	System.out.println(names.element());
	System.out.println(names.peek());
		
	}

}
