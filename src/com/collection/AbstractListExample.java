package com.collection;

import java.util.AbstractList;
import java.util.LinkedList;

public class AbstractListExample {
	
	public static void main(String args[]) { 
		
        AbstractList<String> list = new LinkedList<String>(); 
        list.add("Lion"); 
        list.add("Tiger"); 
        list.add("Zibra"); 
        list.add("Monkey"); 
        list.add("Pig"); 
        System.out.println(list); 
        list.remove(3);  
        System.out.println(list); 
        int lastindex = list.lastIndexOf("Lion");  
        System.out.println(lastindex); 
    } 

}
