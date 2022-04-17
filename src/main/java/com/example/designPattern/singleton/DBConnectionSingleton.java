package com.example.designPattern.singleton;

import java.sql.*;

public class DBConnectionSingleton {
    private static Connection con;

    private static final class ManagerHolder {
        private static final DBConnectionSingleton instance = new DBConnectionSingleton();
    }

    private DBConnectionSingleton() {
        connect();
    }

    private static void connect() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test", "testuser", "testuser");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static DBConnectionSingleton getInstance() {
        return ManagerHolder.instance;
    }

    public static Connection getConnection() {
        try {
            if (con.isClosed()) {
                connect();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }

    public static void close() throws SQLException {
        if (con != null) {
            if (!con.isClosed()) {
                con.close();
            }
        }
    }
}
