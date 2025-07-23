package com.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileInput {
	
	public static void main(String[] args ) {
		try {
			FileInputStream fs = new FileInputStream("student.txt");
			ObjectInputStream in = new ObjectInputStream(fs);
			Student student = (Student)in.readObject();
			in.close();
			fs.close();
			System.out.println("Deserialized Student:");
			System.out.println("Name:" + student.getName());
			System.out.println("Age:" + student.getAge());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
