package com.jdbcUtils.java;

import java.sql.*;
import java.util.Scanner;

/*
 * 实现登录
 * */
public class TestExerLogin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("user:");
        String user = scan.next();
        System.out.println("pwd:");
        String pwd = scan.next();
        boolean login = new Login().login(user, pwd);
        System.out.println(login);
    }
}

class Login {
    public boolean login(String user, String pwd) {
        if (user == null || pwd == null) {
            return false;
        }

        boolean next = false;
        try {
            Connection con = MyUtils.getConnection();
            String sql = "select * from login where user=? and pwd=?";

            // PreparedStatement:预编译sql
            PreparedStatement preState = con.prepareStatement(sql);
            // 给？赋值
            preState.setString(1, user);
            preState.setString(2, pwd);
            // 执行sql
            ResultSet res = preState.executeQuery();
            next = res.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return next;
    }
}