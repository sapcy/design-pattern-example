package com.example.designPattern.singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) {
        DBConnectionSingleton singleton = DBConnectionSingleton.getInstance();
        DBConnectionSingleton singleton2 = DBConnectionSingleton.getInstance();

        Connection conn = singleton.getConnection();
        Connection conn2 = singleton2.getConnection();
        PreparedStatement preparedStatement;
        ResultSet resultSet;

        try {
            preparedStatement = conn.prepareStatement("select * from tb_test");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getString("column1"));
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                DBConnectionSingleton.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
