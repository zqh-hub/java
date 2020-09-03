package com.jdbcUtils.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * 事务
 * */
public class Transaction {
    public static void main(String[] args) {
        String sql1 = "update person set age=age + ? where id = ?";
        String sql2 = "update person set age=age - ? where id = ?";
        Connection con = null;
        PreparedStatement p1 = null;
        PreparedStatement p2 = null;
        try {
            con = MyUtils.getConnection();
            //开启事务
            con.setAutoCommit(false);

            p1 = con.prepareStatement(sql1);
            p2 = con.prepareStatement(sql2);
            p1.setInt(1, 10);
            p1.setInt(2, 1);

            p2.setInt(1, 10);
            p2.setInt(2, 2);

            p1.executeUpdate();
            int i = 1 / 0;
            p2.executeUpdate();

            con.commit();
        } catch (Exception throwables) {
            if (con != null) {
                try {
                    con.rollback();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        } finally {
            MyUtils.close(p1, con);
            MyUtils.close(p2, null);
        }
    }
}
