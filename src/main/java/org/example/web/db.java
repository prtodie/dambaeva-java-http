package org.example.web;

import java.sql.*;

public class db {

    private static final String URL = System.getenv().getOrDefault("DB_URL", "jdbc:mysql://localhost:3306/StudentStore?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true");
    private static final String USER = System.getenv().getOrDefault("DB_USER", "root");
    private static final String PASSWORD = System.getenv().getOrDefault("DB_PASSWORD", "root");

    public static Connection get() throws SQLException {
        return  DriverManager.getConnection(URL, USER, PASSWORD);
    }

}