package com.torryharris.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TrainDAO {

    private final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/traindb";
    private final String USERNAME = "root";
    private final String PASSWORD = "Welcome@123";

    public void Train(int train) throws SQLException {
    }
}



