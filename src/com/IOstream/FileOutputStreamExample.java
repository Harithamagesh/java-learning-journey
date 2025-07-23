package com.IOstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	
	public static void main(String[] args) {
		String data = "Magesh";
		try {
		FileOutputStream fs = new FileOutputStream("mg.txt");
		
		byte[]  databyte = data.getBytes();
		
		fs.write(databyte);
		fs.close();
		System.out.println("Data is printed in hari.txt");
		}
		catch(IOException e){
//			System.out.println("Data is printed in hari.txt");
			e.printStackTrace();
		}
	}

}
