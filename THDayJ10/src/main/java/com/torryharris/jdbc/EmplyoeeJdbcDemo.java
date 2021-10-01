package com.torryharris.jdbc;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.torryharris.model.Emplyoee;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;

public class EmplyoeeJdbcDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/company";
            String username = "root";
            String password = "Welcome@123";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            // display the resultset from DB
            String query="select * from emplyoee";
            ResultSet resultSet= statement.executeQuery(query);
            System.out.println("emplyoee details:");
            while(resultSet.next()){
                int empid= resultSet.getInt("empid");
                String ename=resultSet.getString("ename");
                String designation= resultSet.getString("designation");
                float salary= resultSet.getFloat("salary");
                int yearOfJoining= resultSet.getInt("year_of_joining");
                Emplyoee emplyoee=new Emplyoee(empid,ename,designation,salary,yearOfJoining);
                System.out.println(emplyoee);
            }
            // update the row in DB
            /*String updateQuery="update emplyoee "+"set designation='architect' "+"where year_of_joining=2019";
            System.out.println(updateQuery);
            int rowAffect=statement.executeUpdate(updateQuery);
            System.out.println("table updated successfully");
            System.out.println("no of rows affected "+rowAffect);*/

            // insert into DB
           /* ArrayList<Emplyoee> emplyoeeArrayList = getEmplyoee();
            for (Emplyoee e : emplyoeeArrayList) {
                String insertQuery = "insert into emplyoee values(" + e.getEmpid() + ",'" + e.getEname() + "','" + e.getDesignation() + "'," + e.getSalary() + "," + e.getYearOfJoining() + ")";
                System.out.println(insertQuery);
                statement.execute(insertQuery);
            }
                System.out.println("Inserted successfully");*/

                statement.close();
                connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    // inserting multiple values to DB using ArrayList
    public static ArrayList<Emplyoee> getEmplyoee() {
        Emplyoee e1 = new Emplyoee(1110, "ram", "manager", 20000f, 2019);
        Emplyoee e5 = new Emplyoee(1115, "ram", "sales", 10000f, 2019);
        Emplyoee e2 = new Emplyoee(1112, "sita", "HR", 10000f, 2020);
        Emplyoee e3 = new Emplyoee(1113, "geeta", "Clerk", 1000f, 2017);
        ArrayList<Emplyoee> emplyoees = new ArrayList<>();
        emplyoees.add(e1);
        emplyoees.add(e5);
        emplyoees.add(e2);
        emplyoees.add(e3);
        return emplyoees;
    }
}