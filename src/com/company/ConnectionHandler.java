package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.sql.DriverManager;
import java.util.*;

public class ConnectionHandler {
    private String query;
    private String credentials;

    public ResultSet connectAndFetch(String query) {


        try {

            this.query = query;
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datei", "root", "Arsenal2001-");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("connectAndFetch is connected");





            return resultSet;




        } catch (Exception e) {
            e.printStackTrace();

        }


        return null;
    }

    public void connectAndCrud(String query) {

        try {
            this.query = query;

           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datei", "root", "Arsenal2001-");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
            connection.close();
            System.out.println("connectAndCrud data is inserted");
            System.out.println("connectAndCrud is closed");



        } catch (Exception e) {
            e.printStackTrace();

        }}

        public ResultSet connectAndLogin(String credentials){

            try {

                this.query = query;
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "Arsenal2001-");
                PreparedStatement preparedStatement = connection.prepareStatement(credentials);
                ResultSet resultSet = preparedStatement.executeQuery();
                System.out.println("Login successfull");
                /*connection.close();
                System.out.println("connectAndLoginClosed");


*/



                return resultSet;




            } catch (Exception e) {
                e.printStackTrace();
            }


            return null;
        }

        public static void closeConnection(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "Arsenal2001-");
            System.out.println(" closeConnection closed");
        }catch (Exception e){
            e.printStackTrace();
        }

        }
        }

