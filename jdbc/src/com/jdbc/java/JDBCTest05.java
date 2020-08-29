package com.jdbc.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
* 练习：删除
* */
public class JDBCTest05 {
    public static void main(String[] args) {
        Connection mysql = null;
        Statement state = null;
        try {
            String sql = "delete from person where id=3";
            Class.forName("com.mysql.jdbc.Driver");
            mysql = DriverManager.getConnection("jdbc:mysql:///jdbc", "root", "123456");
            state = mysql.createStatement();
            int res = state.executeUpdate(sql);
            System.out.println(res);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (state != null){
                try {
                    state.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (mysql != null){
                try {
                    mysql.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }


    }
}
