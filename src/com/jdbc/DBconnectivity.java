package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnectivity {
	
	public static void main(String[] args) {
		

	
	String url="jdbc:mysql://localhost:3306/ordermanagement ";
	String UserName="root";
	String Password="haritha1307";
	
	
		try {
			Connection con=DriverManager.getConnection(url, UserName, Password);
			if(con!=null) {
				System.out.println("connected");
				
			}
			else {
				System.out.println("not connected");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
	

}
