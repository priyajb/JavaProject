package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";


//get the connection object
        try (Connection connection = DriverManager.getConnection(url, username, password);
             //create statement object
             Statement statement = connection.createStatement();) {

            //sql query to be executed
            String sql ="update employee set name='praveen' where employeeId=2";
            boolean result = statement.execute(sql);
            System.out.println("table updated " + !result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.getMessage();
        }
    }
}

