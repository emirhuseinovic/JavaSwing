package com.company;

import java.sql.*;
import java.sql.DriverManager;

public class ConnectionHandler {

    public void connect()  {

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Arsenal2001-");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM person");
            System.out.println("Connected");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("name")+resultSet.getString("surname")+ resultSet.getString("email"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
