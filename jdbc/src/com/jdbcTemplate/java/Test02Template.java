package com.jdbcTemplate.java;

import com.druid.java.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test02Template {
    public static void main(String[] args) {
        // 1、导入jar包
        // 2、创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDs());
        // 3、调用方法
        String sql = "update person set age=30 where id=?";
        int res = template.update(sql, 2);
        System.out.println(res);
    }
}
