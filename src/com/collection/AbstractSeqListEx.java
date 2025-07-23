package com.collection;

import java.util.AbstractSequentialList;
import java.util.LinkedList;

public class AbstractSeqListEx {
	
	public static void main(String args[])
    {
		
        AbstractSequentialList<String> a = new LinkedList<String>();
        a.add("Rat");
        a.add("Goat");
        a.add("Donkey");
        a.add("Tiger");
        a.add("Sheep");
        System.out.println(a);
        a.remove(3);
        System.out.println(a);
        System.out.println(a.get(2));
    }

}
