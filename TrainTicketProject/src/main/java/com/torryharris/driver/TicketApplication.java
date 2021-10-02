package com.torryharris.driver;

import com.torryharris.model.Train;
import com.torryharris.model.TrainDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TicketApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Train Number:\n");
        int train_no=sc.nextInt();
        System.out.println("Enter travel Date:\n");
        
        System.out.println("Enter No of Passenger:\n");
        int p_no=sc.nextInt();
        System.out.println("Enter the Passenger Name:\n ");
        String p_name=sc.next();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/traindb";
            String username = "root";
            String password = "Welcome@123";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
           /* ArrayList<Train> trainArrayList = getTrain();
            for (Train t : trainArrayList) {
                String insertQuery = "insert into train values(" + t.getTrain_no() + ",'" + t.getTrain_name() + "','" + t.getSource() + "','" + t.getDestination() + "'," + t.getTicket_price() + ")";
                System.out.println(insertQuery);
                statement.execute(insertQuery);
            }
            System.out.println("Inserted successfully");*/
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
        public static ArrayList<Train> getTrain() {
        Train t1=new Train(1001,"Shatabdi Express","Bangalore","Delhi",2500.0);
        Train t2=new Train(1002,"Shatabdi Express","Delhi","Bangalore",2500.0);
        Train t3=new Train(1003,"Udyan Express","Bangalore","Mumbai",1500.0);
        Train t4=new Train(1004,"Udyan Express","Mumbai","Bangalore",1500.0);
        Train t5=new Train(1005,"Brindhavan Express","Bangalore","Chennai",1000.0);
        Train t6=new Train(1006,"Brindhavan Express","Chennai","Bangalore",1000.0);
        ArrayList<Train>trains = new ArrayList<>();
        trains.add(t1);
        trains.add(t2);
        trains.add(t3);
        trains.add(t4);
        trains.add(t5);
        trains.add(t6);
        return trains;
    }
}


