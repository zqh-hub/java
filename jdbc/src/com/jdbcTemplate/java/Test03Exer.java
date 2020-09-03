package com.jdbcTemplate.java;

import com.druid.java.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Test03Exer {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDs());

    @Test
    public void test01() {
        String sql = "insert into person value(null,?,?,?,null)";
        int res = template.update(sql, "小风", 12, "男");
        System.out.println(res);
    }

    @Test
    public void test02() {
        String sql = "delete from person where id=?";
        int res = template.update(sql, 5);
        System.out.println(res);
    }

    @Test
    public void test03() {
        String sql = "select * from person where id=?";
        // queryForMap():只能是1条
        Map<String, Object> map = template.queryForMap(sql, 1);
        System.out.println(map);
    }

    @Test
    public void test04() {
        String sql = "select * from person";
        // queryForList()
        List<Map<String, Object>> maps = template.queryForList(sql);
        for (Map map : maps) {
            System.out.println(map);
        }
    }

    @Test
    public void test05() {
        String sql = "select * from person";
        // queryForList()
        List<Emp> query = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet resultSet, int i) throws SQLException {
                Emp emp = new Emp();
                int id = emp.getId();
                String name = emp.getName();
                int age = emp.getAge();
                String gender = emp.getGender();
                Date birthday = emp.getBirthday();

                emp.setId(id);
                emp.setName(name);
                emp.setAge(age);
                emp.setGender(gender);
                emp.setBirthday(birthday);
                return emp;
            }
        });
    }

    @Test
    public void test06() {
        String sql = "select * from person";
        // queryForList()
        List<Emp> query = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp q : query) {
            System.out.println(q);
        }
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