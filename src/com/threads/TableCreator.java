package com.threads;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TableCreator {

    static final String URL = "jdbc:mysql://localhost:3306/bus_booking";
    static final String USER = "root";
    static final String PASSWORD = "haritha1307";

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = con.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS booking(" +
                         "id INT AUTO_INCREMENT PRIMARY KEY, " +
                         "name VARCHAR(50), " +
                         "age INT, " +
                         "tickets INT)";

            stmt.executeUpdate(sql);
            System.out.println("Table 'booking' created successfully.");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
