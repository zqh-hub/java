package com.druid.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 使用JDBCUtils
 * */
public class Test02Utils {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement preState = null;
        try {
            String sql = "insert into person value(null,?,?,?,?)";
            con = JDBCUtils.getConnection();
            preState = con.prepareStatement(sql);
            preState.setString(1, "小小");
            preState.setInt(2, 23);
            preState.setString(3, "男");
            preState.setDate(4, null);
            int i = preState.executeUpdate();
            System.out.println(i);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(preState, con);
        }
    }
}
