package com.jdbc.java;

import java.sql.*;

/*
 * ResultSet
 * */
public class JDBCTest07 {
    public static void main(String[] args) {
        Connection mysql = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            mysql = DriverManager.getConnection("jdbc:mysql:///jdbc", "root", "123456");
            statement = mysql.createStatement();
            ResultSet res = statement.executeQuery("select * from person");
            // 处理结果
            // 1、让游标向下移动一行
            res.next();
            // 2、获取数据
            int id = res.getInt(1);
            String name = res.getString("name");


            System.out.println(id + "," + name);
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
