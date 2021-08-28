package com.company;

import java.sql.*;
import java.sql.DriverManager;

public class ConnectionHandler {
    private String query;

    public void connectAndFetch(String query)  {

        try {
            this.query=query;
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Arsenal2001-");
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            ResultSet resultSet=preparedStatement.executeQuery();
            System.out.println("Connected");

          while (resultSet.next()) {
               int i=0;
                System.out.println(resultSet.getString(i));
                i++;

            }
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void connectAndCrud(String query)  {

        try {
            this.query=query;
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Arsenal2001-");
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.executeUpdate();
            System.out.println("Connected");
            connection.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
