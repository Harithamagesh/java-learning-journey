package com.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class File2 {
	
	public static void main(String[] args) {
		try {
			FileWriter write = new FileWriter("mg.txt");
			write.write("Haritha");
			write.append("Pavish");
			if(write != null) {
				System.out.println("Success");
			}
			else {
				System.out.println("Fail");
			}
			write.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
