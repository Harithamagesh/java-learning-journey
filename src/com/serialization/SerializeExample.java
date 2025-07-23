package com.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeExample {
	
	public static void main(String[] args)  {
		
		Student s1 = new Student("Haritha", 21);
		
		
		try {
			FileOutputStream fs = new FileOutputStream("student.txt");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(s1);
			os.close();
			fs.close();
			System.out.println("Data is saved in std.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
