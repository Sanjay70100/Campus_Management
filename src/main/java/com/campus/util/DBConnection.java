package com.campus.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/campus_db";
    private static final String DB_USER= "postgres";
    private static final String DB_PASSWORD = "password";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Database connection established successfully");
        }
        catch (SQLException e) {
            System.out.println("Failed to establish database connection");
            e.printStackTrace();
        }
        return conn;
    }
}