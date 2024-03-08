package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";


//get the connection object
        try (Connection connection = DriverManager.getConnection(url, username, password);
             //create statement object
             Statement statement = connection.createStatement();) {

            //sql query to be executed
            String sql =
                    "select * from employee";
            ResultSet result = statement.executeQuery(sql);
        while (result.next()){
            String name=result.getString("name");
            int employeeId=result.getInt("employeeId");
            String city=result.getString("city");

            System.out.println(name+"\t"+employeeId+"\t"+city);
     }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.getMessage();
        }
    }
}

