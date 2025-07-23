package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateData {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sys";
        String userName = "root";
        String password = "haritha1307";

        try {
            Connection con = DriverManager.getConnection(url, userName, password);
            if (con != null) {
                System.out.println("Connected");
                String sql = "UPDATE emp SET name = ?, age = ? WHERE id = ?";
                PreparedStatement pre = con.prepareStatement(sql);
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the ID of the employee to update:");
                int id = sc.nextInt();
                sc.nextLine(); 
                System.out.println("Enter the new name:");
                String name = sc.nextLine();
                System.out.println("Enter the new age:");
                int age = sc.nextInt();
                pre.setString(1, name);
                pre.setInt(2, age);
                pre.setInt(3, id);
                int rowsAffected = pre.executeUpdate();
                System.out.println(rowsAffected + " row(s) affected.");
                System.out.println("row updated");
                pre.close();
                con.close();
            } else {
                System.out.println("Not Connected");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
