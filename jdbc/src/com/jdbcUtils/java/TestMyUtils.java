package com.jdbcUtils.java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMyUtils {
    public static void main(String[] args) {
        Connection base = null;
        Statement state = null;
        try {
            base = MyUtils.getConnection();
            state = base.createStatement();
            ResultSet res = state.executeQuery("select * from person");
            while (res.next()) {
                int id = res.getInt("id");
                System.out.println(id);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        MyUtils.close(state, base);
    }
}
