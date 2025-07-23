package com.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {
	
	public static void main(String[] args) {
//		try {
//			FileWriter exam = new FileWriter("naru.txt",true);
//			exam.write("haritha");
//			exam.append("magesh");
//			if(exam!= null) {
//				System.out.println("success");
//			}else {
//				System.out.println("fail");
//			}
//			exam.close();
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
		
		
		try {
			FileReader read = new FileReader("naru.txt");
			try {
				int ch;
				while((ch = read.read()) != -1) {
					System.out.print((char) ch);
				}
				read.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
}
		
		
			
				
