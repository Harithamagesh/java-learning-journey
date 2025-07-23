package com.threads;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TicketBooking {
	
	
    
		static String url="jdbc:mysql://localhost:3306/bus_booking";
		static String username="root";
		static String password="haritha1307";
		static int availableTickets= 20;
		public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			if(con !=null) {
				System.out.println("Connected");
				String sql = "select * from booking";
				ResultSet res = st.executeQuery(sql);
				int bookedTotal = 0;
				
				System.out.println("==========================================");
                System.out.printf("%-5s %-10s %-5s %-10s\n", "ID", "Name", "Age", "Tickets");
                System.out.println("==========================================");

				while(res.next()) {
					int id = res.getInt("id");
					String name = res.getString("name");
					int age = res.getInt("age");
					int tickets = res.getInt("tickets");
					bookedTotal += tickets;
					System.out.printf("%-5d %-10s %-5d %-10d\n", id, name, age, tickets);
				}
				int available = availableTickets - bookedTotal;
				System.out.println("==========================================");
                System.out.println("\nTotal Tickets Booked: " + bookedTotal);
                System.out.println("Tickets Remaining   : " + available);

				res.close();
				st.close();
				con.close();
			}
			else {
				System.out.println("Not connected");
			}
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
}  