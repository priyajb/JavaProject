package com.jdbc.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreUpdate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";

        String sql = "update cab1 set driver_name=? where cab_number=?";

        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement statement = connection.prepareStatement(sql);
                Scanner sc = new Scanner(System.in);
        ) {
            String driverName = sc.next();
            int cabNumber = sc.nextInt();


            statement.setInt(2, cabNumber);
            statement.setString(1, driverName);
            boolean result = statement.execute();
            System.out.println(result);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
