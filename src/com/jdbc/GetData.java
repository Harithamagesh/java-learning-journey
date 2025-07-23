package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetData {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/sys";
		String username="root";
		String password="haritha1307";
		
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			if(con !=null) {
				System.out.println("Connected");
				String sql = "select * from emp";
				Statement st = con.createStatement();
				ResultSet res = st.executeQuery(sql);
				while(res.next()) {
					int id = res.getInt("id");
					String name = res.getString("name");
					int age = res.getInt("age");
					System.out.println(id+" "+name+" "+age);
				}
				res.close();
				st.close();
				con.close();
			}
			else {
				System.out.println("Not connected");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
