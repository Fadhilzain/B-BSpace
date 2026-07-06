package com.bbspace.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/bbspace";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Koneksi Database Berhasil!");

            return conn;

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println("Koneksi Database Gagal!");

            e.printStackTrace();

            return null;

        }

    }

}