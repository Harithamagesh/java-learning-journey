package com.task;

import java.util.Iterator;
import java.util.LinkedList; 
import java.util.List;

public class Data {
	
	public static void main(String[] args) {
		
		List<ListTask2> d = new LinkedList<ListTask2>();
		d.add(new ListTask2("Naresh", 22, "O+"));
		d.add(new ListTask2("Haritha", 21, "O-"));
		d.add(new ListTask2("Pragathi",06, "O+"));
		
		for(ListTask2 ds : d) {
			System.out.println("Name:"+ds.name +"  Age:"+ds.age);
		}
		
		  System.out.println("iterator");
		 Iterator a= d.iterator();
		 System.out.println(a.hasNext());
		 
		 while(a.hasNext()) {
			 System.out.println(a.next());
		 }
		
	}

}
