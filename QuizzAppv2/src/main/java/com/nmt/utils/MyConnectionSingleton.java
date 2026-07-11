/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nmt.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class MyConnectionSingleton {

    private static MyConnectionSingleton instance;
    private Connection conn;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.getLogger(MyConnectionSingleton.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    private MyConnectionSingleton() {
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost/quizdb", "root", "169285");
        } catch (SQLException ex) {
            System.getLogger(MyConnectionSingleton.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public static MyConnectionSingleton getInstance() {
        if (instance == null) {
            instance = new MyConnectionSingleton();
        }
        return instance;
    }

    public Connection connect() {
        return this.conn;
    }

    public void close() {
        if (this.conn != null) {
            try {
                this.conn.close();
            } catch (SQLException ex) {
                System.getLogger(MyConnectionSingleton.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
    }
}
