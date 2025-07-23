package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/sys";
		String username = "root";
		String password = "haritha1307";

		try {
			Connection con = DriverManager.getConnection(url, username, password);
			if (con != null) {
				System.out.println("Connected");

				int idToDelete = 101;
				String sql = "DELETE FROM emp WHERE id = " + idToDelete;

				Statement st = con.createStatement();
				int rowsAffected = st.executeUpdate(sql);

				if (rowsAffected > 0) {
					System.out.println("Deleted successfully. Rows affected: " + rowsAffected);
				} else {
					System.out.println("No record found with id: " + idToDelete);
				}

				st.close();
				con.close();
			} else {
				System.out.println("Not connected");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

