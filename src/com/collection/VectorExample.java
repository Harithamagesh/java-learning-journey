package com.collection;

import java.util.Vector;

public class VectorExample {
	
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Black");
		v.add("Blue");
		v.add("Red");
		System.out.println(v);
		System.out.println(v.get(0));
		v.remove(2);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.contains("Blue"));
		System.out.println(v.isEmpty());
		System.out.println(v.toString());
		v.set(0, "Pink");
		System.out.println(v);
	}

}
