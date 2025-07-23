package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		List<String> name = new ArrayList<String>();
		name.add("Haritha");
		name.add("Lily");
		name.add("Luna");
		System.out.println(name);
		name.add(2,"Neha");
		System.out.println(name);
		System.out.println(name.get(0));	
		name.set(2, "Hana");
		System.out.println(name);
		name.remove(1);
		System.out.println(name);
		System.out.println(name.size());
		System.out.println(name.isEmpty());
		System.out.println(name.contains("Luna"));
		System.out.println(name.indexOf("Haritha"));
		System.out.println(name.lastIndexOf("Hana"));
		System.out.println(name.subList(0, 2));
		
		for(String names : name) {
			System.out.println(names);
		}
		
	}

}
