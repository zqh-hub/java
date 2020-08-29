package com.jdbc.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 练习：修改
 * */
public class JDBCTest04 {
    public static void main(String[] args) {
        Connection mysql = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "update person set age=100 where age=23";
            mysql = DriverManager.getConnection("jdbc:mysql:///jdbc", "root", "123456");
            statement = mysql.createStatement();
            int res = statement.executeUpdate(sql);
            System.out.println(res);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (mysql != null) {
                try {
                    mysql.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        }

    }
}
