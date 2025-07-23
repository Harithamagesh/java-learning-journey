package com.error;

public class ClassCast {
	public static void main(String[] args) {
        Object obj = new Integer(10);
        try {
            String str = (String) obj; 
            System.out.println(str);
        } 
         catch (ClassCastException e) {
        	 System.err.println("hnbn");
        }
    }

}
