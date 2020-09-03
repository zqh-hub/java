package com.jdbc.java;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// 练习：定义一个方法，查询表的数据，并封装到对象中
public class JDBCTest08 {
    public static void main(String[] args) {
        JDCBEmp jdcbEmp = new JDCBEmp();
        List<Emp> all = jdcbEmp.findAll();
        Iterator<Emp> iterator = all.iterator();
        while (iterator.hasNext()) {
            Emp next = iterator.next();
            System.out.println(next.toString());
        }
    }
}

class JDCBEmp {
    public List<Emp> findAll() {
        String sql = "select * from person";
        Connection mysql = null;
        Statement statement = null;
        ArrayList<Emp> emps = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            mysql = DriverManager.getConnection("jdbc:mysql:///jdbc", "root", "123456");
            statement = mysql.createStatement();
            ResultSet res = statement.executeQuery(sql);
            // 存储数据
            Emp emp = null;
            emps = new ArrayList<>();
            while (res.next()) {
                int id = res.getInt("id");
                final String name = res.getString("name");
                int age = res.getInt("age");
                String gender = res.getString("gender");
                Date birthday = res.getDate("birthday");

                emp = new Emp();
                emp.setId(id);
                emp.setName(name);
                emp.setAge(age);
                emp.setGender(gender);
                emp.setBirthday(birthday);

                emps.add(emp);
            }
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
        return emps;
    }
}

class Emp {
    private int id;
    private String name;
    private int age;
    private String gender;
    private Date birthday;

    public Emp() {
    }

    public Emp(int id, String name, int age, String gender, Date birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthday = birthday;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}