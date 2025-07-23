package com.threads;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BookingInserter {
		
		public static void main(String[] args) {
			String url ="jdbc:mysql://localhost:3306/bus_booking";
			String UserName = "root";
			String Password ="haritha1307";
			
			try {
				Connection con = DriverManager.getConnection(url, UserName, Password);
				if(con != null) {
					System.out.println("Connected");
					String sql="insert into booking (name,age,tickets) values(?,?,?)";
			PreparedStatement pre=con.prepareStatement(sql);
			Scanner sc=new Scanner(System.in);
			System.out.println("How many ticket booking:");
			int count = sc.nextInt();
			for(int i=0;i<count;i++) {
				System.out.println("booking" + (i + 1));
			System.out.println("enter the name");
			String name=sc.next();
			pre.setString(1, name);
			System.out.println("enter the age");
			int age=sc.nextInt();
			pre.setInt(2, age);
			System.out.println("enter the tickets");
			int tickets=sc.nextInt();
			pre.setInt(3, tickets);
			
			pre.executeUpdate();
			System.out.println("Booking saved for " + name);
			}
			pre.close();
			con.close();
			System.out.println("All booking completed successfully!");
				}
				else {
					System.out.println("Not Connected");
				}
			} catch (SQLException e) {
				System.out.println("Error: " + e.getMessage());
				e.printStackTrace();
			}
		}

	}

