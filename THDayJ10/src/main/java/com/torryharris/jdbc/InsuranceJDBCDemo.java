package com.torryharris.jdbc;

import com.torryharris.model.Emplyoee;
import com.torryharris.model.Insurance;

import java.sql.*;
import java.util.ArrayList;

public class InsuranceJDBCDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/company";
            String username = "root";
            String password = "Welcome@123";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
/*
            ArrayList<Insurance>insuranceArrayLis=getInsurance();
            for (Insurance i : insuranceArrayLis) {
                String insertQuery = "insert into insurance values('" + i.getInsname()  + "'," + i.getInsid() + "," + i.getInssum() + ",'" + i.getInstype() + "')";
                System.out.println(insertQuery);
                statement.execute(insertQuery);
            }
            System.out.println("Inserted successfully");
*/
            String query="select * from insurance";
            ResultSet resultSet= statement.executeQuery(query);
            System.out.println("Insurance details:");
            while(resultSet.next()){
               String insname= resultSet.getString("insname");
                int insid=resultSet.getInt("insid");
                int inssum= resultSet.getInt("inssum");
                String instype= resultSet.getString("instype");
                Insurance insurance=new Insurance(insname,insid,inssum,instype);
                System.out.println(insurance);
                System.out.println();
            }
            String query1="select * from insurance where instype='Term'";
            ResultSet resultSet1= statement.executeQuery(query1);
            System.out.println("Insurance details who has type 'Term':");
            while(resultSet1.next()){
                String insname= resultSet1.getString("insname");
                int insid=resultSet1.getInt("insid");
                int inssum= resultSet1.getInt("inssum");
                String instype= resultSet1.getString("instype");
                Insurance insurance=new Insurance(insname,insid,inssum,instype);
                System.out.println(insurance);

            }
            System.out.println();
            String query2="select * from insurance order by inssum";
            ResultSet resultSet2= statement.executeQuery(query2);
            System.out.println("Insurance details ordered by sum:");
            while(resultSet2.next()) {
                String insname = resultSet2.getString("insname");
                int insid = resultSet2.getInt("insid");
                int inssum = resultSet2.getInt("inssum");
                String instype = resultSet2.getString("instype");
                Insurance insurance = new Insurance(insname, insid, inssum, instype);
                System.out.println(insurance);

            }
            System.out.println();
            String query3="select * from insurance where inssum>300000";
            ResultSet resultSet3= statement.executeQuery(query3);
            System.out.println("Insurance details whose sum is more than 300000:");
            while(resultSet3.next()) {
                String insname = resultSet3.getString("insname");
                int insid = resultSet3.getInt("insid");
                int inssum = resultSet3.getInt("inssum");
                String instype = resultSet3.getString("instype");
                Insurance insurance = new Insurance(insname, insid, inssum, instype);
                System.out.println(insurance);

            }
            System.out.println();
            String updateQuery="update insurance "+" set inssum=inssum+(inssum*20/100) "+" where inssum>100000";
            int rowAffect=statement.executeUpdate(updateQuery);
            System.out.println("table updated successfully");
            System.out.println("no of rows affected "+rowAffect);
            System.out.println();

            System.out.println();
            String query4="select * from insurance ";
            ResultSet resultSet4= statement.executeQuery(query4);
            System.out.println("Insurance details where sum is increased by 20% :");
            while(resultSet4.next()) {
                String insname = resultSet4.getString("insname");
                int insid = resultSet4.getInt("insid");
                int inssum = resultSet4.getInt("inssum");
                String instype = resultSet4.getString("instype");
                Insurance insurance = new Insurance(insname, insid, inssum, instype);
                System.out.println(insurance);
            }
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
        // inserting multiple values to DB using ArrayList
    public static ArrayList<Insurance> getInsurance() {
      Insurance i1=new Insurance("HDFC",12001,500000,"Health");
        Insurance i2=new Insurance("LIC",12401,300000,"Health");
        Insurance i3=new Insurance("HDFC",12031,800000,"Term");
        Insurance i4=new Insurance("Canara Bank",13891,700000,"Term");
        Insurance i5=new Insurance("LIC",12491,500000,"Health");
        ArrayList<Insurance>insurances = new ArrayList<>();
        insurances.add(i1);
        insurances.add(i2);
        insurances.add(i3);
        insurances.add(i4);
        insurances.add(i5);
        return insurances;
    }
        }

