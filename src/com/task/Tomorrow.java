package com.task;

public class Tomorrow {
	public static void main(String[] args) {
		String s = "Tomorrow";
		String result=" ";
		String stars = "*";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='o') {
				result+=stars;
				stars += "*";
			}else {
			result+=ch;
			
			}
		}
		System.out.println(result);

		}
	}

	
	
