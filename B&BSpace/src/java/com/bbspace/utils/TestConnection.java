package com.bbspace.utils;

import com.bbspace.database.DBConnection;
import java.sql.Connection;

public class TestConnection {

    public static void main(String[] args) {

        Connection conn = DBConnection.getConnection();

        if(conn != null){

            System.out.println("Database berhasil terkoneksi.");

        }else{

            System.out.println("Database gagal terkoneksi.");

        }

    }

}